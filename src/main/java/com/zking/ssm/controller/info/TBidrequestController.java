package com.zking.ssm.controller.info;
/*
@author yani
@create 2019-12-1215:52
*/

import com.zking.ssm.model.info.*;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;
import com.zking.ssm.service.info.*;
import com.zking.ssm.service.sys.ISysTemdictionaryitemService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tBidrequest")
public class TBidrequestController {
    @Resource
    private IBidrequestService bidrequestService;
    @Resource
    private ISysTemdictionaryitemService tSysTemdictionaryitemService;
    @Resource
    private IAccountService accountService;
    @Resource
    private IAccountflowService accountflowService;
    @Resource
    private ILoanstableService loanstableService;
    @Resource
    private IRepaymentService repaymentService;
    @RequestMapping("/SelectBidrequestpaging")
    public Object SelectBidrequestpaging(HttpServletRequest request, TBidrequest bidrequest){

        DataProtocol data = new DataProtocol();

        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);

        List<TBidrequest> lst=bidrequestService.sellctBidRequest(bidrequest,pageBean);

        if(lst!=null){
            for(TBidrequest b:lst){
                TSysTemdictionaryitem tt=new TSysTemdictionaryitem();
                tt.setSysfiId(b.getReturnType());
                TSysTemdictionaryitem tSysTemdictionaryitem= tSysTemdictionaryitemService.selectTitle(tt);
                b.setStateName(tSysTemdictionaryitem.getTitle());
            }
            data.setCode(DataProtocol.SUCCESS);
            data.setMessage("操作成功");
        }else{
            data.setCode(DataProtocol.FAIL);
            data.setMessage("操作失败");
        }

        data.setData(lst);
        return data;
    }
    @RequestMapping("/touzi")
    //投资的方法
    public Object touzi(@RequestBody TBidrequest tBidrequest) throws ParseException {
        System.out.println(tBidrequest.toString());
        DataProtocol data=new DataProtocol();
        //第一步修改投资用户的账户可用余额（减少）
        TAccount account=new TAccount();
        //投资用户id
        account.setUserId(tBidrequest.getDisableDays());
        account.setUsableAmount(tBidrequest.getBidRequestAmount());
        int n=accountService.updateaccount(account);
        if(n>0){
            //新增投资用户的账户流水记录
            TAccountflow accountflow=new TAccountflow();
            accountflow.setAmount(tBidrequest.getBidRequestAmount());
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            Date date=df.parse(df.format(new Date()));
            accountflow.setTradeTime(date);
            //1=投资
            accountflow.setActionType(1);
            accountflow.setNote("投资支出");
            //投资账户id
            accountflow.setAccountId(tBidrequest.getBidCount());
            accountflow.setUsableAmount(tBidrequest.getBidRequestAmount());
            int n1=accountflowService.addFlow(accountflow);
            if(n1>0){
                //第二步修改借款用户的账户可用余额（增加）
                TAccount a=new TAccount();
                //借款用户id
                a.setUserId(tBidrequest.getCreateuserId());
                a.setUsableAmount(tBidrequest.getBidRequestAmount());
                int n2=accountService.updateac(a);
                if(n2>0){
                    //新增借款用户的账户流水记录
                    TAccountflow aflow=new TAccountflow();
                    aflow.setAmount(tBidrequest.getBidRequestAmount());
                    aflow.setTradeTime(date);
                    //2=借款
                    aflow.setActionType(2);
                    aflow.setNote("借款收入");
                    //借款人账户id
                    aflow.setAccountId(tBidrequest.getCreateuserId());
                    aflow.setUsableAmount(tBidrequest.getBidRequestAmount());
                    int n3=accountflowService.addFlow(aflow);
                    if(n3>0){
                        //第三步修改借款表的状态
                        TBidrequest bid=new TBidrequest();
                        bid.setBidId(tBidrequest.getBidId());
                        //状态2=已投资
                        bid.setBidRequestState(2);
                        int n4=bidrequestService.updatebid(bid);
                        if(n4>0){
                            //第四步新增一张贷款记录
                            TLoanstable loan=new TLoanstable();
                            loan.setApplyforloanid(tBidrequest.getBidId());
                            loan.setUserid(tBidrequest.getCreateuserId());
                            loan.setLoantime(df.format(new Date()));
                            loan.setMoney(tBidrequest.getBidRequestAmount()+"");
                            loan.setStagetypeId(tBidrequest.getMonthesReturn()+"");
                            loan.setRepayment(tBidrequest.getReturnType()+"");
                            loan.setShould(tBidrequest.getBidRequestAmount()+"");
                            loan.setInterestrate(tBidrequest.getCurrentRate());
                            int n5=loanstableService.addloanst(loan);
                            if(n5>0){
                                //第五步自动生成还款记录
                                TRepayment rep=new TRepayment();
                                rep.setUserId(tBidrequest.getCreateuserId());
                                rep.setBidId(tBidrequest.getBidId());
                                //获取最新的贷款id
                                TLoanstable l=loanstableService.listxin();
                                rep.setLoId(l.getLoId());
                                //把利息转换为小数
                                Double num = (Double ) NumberFormat.getInstance().parse(tBidrequest.getCurrentRate()); // 转换的结果是67.89
                                Double lixi=num/100;
                                BigDecimal md = new BigDecimal(lixi);
                                if(tBidrequest.getReturnType()==1){
                                    //本金最后还，先月供利息
                                    if(tBidrequest.getMonthesReturn()==3){
                                        //分一期
                                        for(int i = 1; i <=1; i++){
                                            rep.setFenType("第"+i+"期");
                                            rep.setCapital(tBidrequest.getBidRequestAmount()+"");
                                            BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                            rep.setInterest(interest+"");
                                            rep.setRefuMoney(tBidrequest.getBidRequestAmount().add(interest)+"");
                                            rep.setRepayType("未还款");
                                            LocalDate futureDate = LocalDate.now().plusMonths(i);
                                            rep.setRefuTime(futureDate+"");
                                            int n6=repaymentService.addrep(rep);
                                        }
                                    }else if(tBidrequest.getMonthesReturn()==4){
                                        //分三期
                                        for(int i = 1; i <=3; i++){
                                            if(i==3){
                                                rep.setFenType("第"+i+"期");
                                                rep.setCapital(tBidrequest.getBidRequestAmount()+"");
                                                BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                                rep.setInterest(interest+"");
                                                rep.setRefuMoney(tBidrequest.getBidRequestAmount().add(interest)+"");
                                                rep.setRepayType("未还款");
                                                LocalDate futureDate = LocalDate.now().plusMonths(i);
                                                rep.setRefuTime(futureDate+"");
                                                int n6=repaymentService.addrep(rep);

                                            }else{
                                                rep.setFenType("第"+i+"期");
                                                rep.setCapital("0");
                                                BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                                rep.setInterest(interest+"");
                                                rep.setRefuMoney(interest+"");
                                                rep.setRepayType("未还款");
                                                LocalDate futureDate = LocalDate.now().plusMonths(i);
                                                rep.setRefuTime(futureDate+"");
                                                int n6=repaymentService.addrep(rep);
                                            }
                                        }
                                    }else if(tBidrequest.getMonthesReturn()==5){
                                        //分六期
                                        for(int i = 1; i <=6; i++){
                                            if(i==6){
                                                rep.setFenType("第"+i+"期");
                                                rep.setCapital(tBidrequest.getBidRequestAmount()+"");
                                                BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                                rep.setInterest(interest+"");
                                                rep.setRefuMoney(tBidrequest.getBidRequestAmount().add(interest)+"");
                                                rep.setRepayType("未还款");
                                                LocalDate futureDate = LocalDate.now().plusMonths(i);
                                                rep.setRefuTime(futureDate+"");
                                                int n6=repaymentService.addrep(rep);

                                            }else{
                                                rep.setFenType("第"+i+"期");
                                                rep.setCapital("0");
                                                BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                                rep.setInterest(interest+"");
                                                rep.setRefuMoney(interest+"");
                                                rep.setRepayType("未还款");
                                                LocalDate futureDate = LocalDate.now().plusMonths(i);
                                                rep.setRefuTime(futureDate+"");
                                                int n6=repaymentService.addrep(rep);
                                            }
                                        }

                                    }else if(tBidrequest.getMonthesReturn()==6){
                                        //分十二期
                                        for(int i = 1; i <=12; i++){
                                            if(i==12){
                                                rep.setFenType("第"+i+"期");
                                                rep.setCapital(tBidrequest.getBidRequestAmount()+"");
                                                BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                                rep.setInterest(interest+"");
                                                rep.setRefuMoney(tBidrequest.getBidRequestAmount().add(interest)+"");
                                                rep.setRepayType("未还款");
                                                LocalDate futureDate = LocalDate.now().plusMonths(i);
                                                rep.setRefuTime(futureDate+"");
                                                int n6=repaymentService.addrep(rep);

                                            }else{
                                                rep.setFenType("第"+i+"期");
                                                rep.setCapital("0");
                                                BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                                rep.setInterest(interest+"");
                                                rep.setRefuMoney(interest+"");
                                                rep.setRepayType("未还款");
                                                LocalDate futureDate = LocalDate.now().plusMonths(i);
                                                rep.setRefuTime(futureDate+"");
                                                int n6=repaymentService.addrep(rep);
                                            }
                                        }

                                    }
                                }else if(tBidrequest.getReturnType()==2){
                                    //本金和利息一起月供
                                    if(tBidrequest.getMonthesReturn()==3){
                                    //分一期
                                    for(int i = 1; i <=1; i++){
                                        rep.setFenType("第"+i+"期");
                                        rep.setCapital(tBidrequest.getBidRequestAmount()+"");
                                        BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                        rep.setInterest(interest+"");
                                        rep.setRefuMoney(tBidrequest.getBidRequestAmount().add(interest)+"");
                                        rep.setRepayType("未还款");
                                        LocalDate futureDate = LocalDate.now().plusMonths(i);
                                        rep.setRefuTime(futureDate+"");
                                        int n6=repaymentService.addrep(rep);
                                    }
                                }else if(tBidrequest.getMonthesReturn()==4){
                                    //分三期
                                        //计算本金
                                        BigDecimal bj = new BigDecimal(3);
                                        BigDecimal bj2=tBidrequest.getBidRequestAmount().divide(bj,2,BigDecimal.ROUND_HALF_UP);
                                        for(int i = 1; i <=3; i++){
                                            rep.setFenType("第"+i+"期");
                                            rep.setCapital(bj2+"");
                                            BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                            rep.setInterest(interest+"");
                                            rep.setRefuMoney(interest.add(bj2)+"");
                                            rep.setRepayType("未还款");
                                            LocalDate futureDate = LocalDate.now().plusMonths(i);
                                            rep.setRefuTime(futureDate+"");
                                            int n6=repaymentService.addrep(rep);
                                    }
                                }else if(tBidrequest.getMonthesReturn()==5){
                                    //分六期
                                        //计算本金
                                        BigDecimal bj = new BigDecimal(6);
                                        BigDecimal bj2=tBidrequest.getBidRequestAmount().divide(bj,2,BigDecimal.ROUND_HALF_UP);
                                        for(int i = 1; i <=6; i++){
                                            rep.setFenType("第"+i+"期");
                                            rep.setCapital(bj2+"");
                                            BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                            rep.setInterest(interest+"");
                                            rep.setRefuMoney(interest.add(bj2)+"");
                                            rep.setRepayType("未还款");
                                            LocalDate futureDate = LocalDate.now().plusMonths(i);
                                            rep.setRefuTime(futureDate+"");
                                            int n6=repaymentService.addrep(rep);
                                        }
                                    }
                                    else if(tBidrequest.getMonthesReturn()==6){
                                    //分十二期
                                        //计算本金
                                        BigDecimal bj = new BigDecimal(12);
                                        BigDecimal bj2=tBidrequest.getBidRequestAmount().divide(bj,2,BigDecimal.ROUND_HALF_UP);
                                        for(int i = 1; i <=12; i++){
                                            rep.setFenType("第"+i+"期");
                                            rep.setCapital(bj2+"");
                                            BigDecimal interest=tBidrequest.getBidRequestAmount().multiply(md).setScale(2,BigDecimal.ROUND_HALF_UP);
                                            rep.setInterest(interest+"");
                                            rep.setRefuMoney(interest.add(bj2)+"");
                                            rep.setRepayType("未还款");
                                            LocalDate futureDate = LocalDate.now().plusMonths(i);
                                            rep.setRefuTime(futureDate+"");
                                            int n6=repaymentService.addrep(rep);
                                        }
                                    }
                                }
                                }
                            }
                        }
                    }
                }
            }
            data.setCode(1);
        return data;
    }
    @RequestMapping("/listTBidrequestPage")
    public Object listTBidrequestPage(@RequestBody TBidrequest tBidrequest){
        DataProtocol data = new DataProtocol();
        List<TBidrequest> tb = bidrequestService.listTBidrequestPage(tBidrequest);
        if(tb != null){
            for(TBidrequest bid:tb){
                //获取还款方式
               TSysTemdictionaryitem item=new TSysTemdictionaryitem();
               item.setSysfiId(bid.getReturnType());
               TSysTemdictionaryitem t = tSysTemdictionaryitemService.selectTitle(item);
               bid.setReturnName(t.getTitle());
               item.setSysfiId(bid.getMonthesReturn());
               TSysTemdictionaryitem t1 = tSysTemdictionaryitemService.selectTitle(item);
               bid.setMonthesReturntitle(t1.getTitle());
               System.err.println(bid.toString());
            }
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(tb);
            return data;
        }
        else {
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }

    }

    /**
     * 查询所有产品类型
     * @param bidrequesttype
     * @return
     */
    @RequestMapping("/getbidRequestTypeAll")
    public Object getbidRequestTypeAll(TBidrequest bidrequesttype){
        DataProtocol data = new DataProtocol();
        List<TBidrequest> tb = bidrequestService.getbidRequestTypeAll(bidrequesttype);
        if(tb != null){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(tb);
            return data;
        }
        else {
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }

    }







}
