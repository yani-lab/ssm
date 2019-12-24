package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:30
*/

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.info.TAccountMapper;
import com.zking.ssm.mapper.info.TAccountflowMapper;
import com.zking.ssm.mapper.info.TRepaymentMapper;
import com.zking.ssm.mapper.sys.TSysTemaccountMapper;
import com.zking.ssm.mapper.sys.TSysTemaccountflowMapper;
import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.model.info.TRepayment;
import com.zking.ssm.model.sys.TSysTemaccount;
import com.zking.ssm.model.sys.TSysTemaccountflow;
import com.zking.ssm.service.info.IRepaymentService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class IRepaymentServiceImpl implements IRepaymentService {
    @Resource
    private TRepaymentMapper repaymentMapper;
    @Resource
    private TAccountMapper accountMapper;
    @Resource
    private TAccountflowMapper accountflowMapper;
    @Resource
    private TSysTemaccountMapper sysTemaccountMapper;
    @Resource
    private TSysTemaccountflowMapper sysTemaccountflowMapper;

    @Override
    public List<TRepayment> listrep(TRepayment repayment) {
        return repaymentMapper.listrep(repayment);
    }

    @Override
    public List<TRepayment> list() {
        return repaymentMapper.list();
    }

    @Override
    public int updaterep(TRepayment repayment) {
        return repaymentMapper.updaterep(repayment);
    }

    @Override
    public List<TRepayment> getByLoId(TRepayment repayment) {
        return repaymentMapper.getByLoId(repayment);
    }
    @Override
    public List<TRepayment> selectRepayment(TRepayment repayment, PageBean pageBean) {
        if(pageBean!=null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
         List<TRepayment> list= repaymentMapper.selectRepayment(repayment);
        if(pageBean!=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return list;
    }

    @Override
    public int updateRepayment(TRepayment repayment) {

        TAccount account = new TAccount();
        account.setUserId(repayment.getUserId());
        TAccount tsa = accountMapper.selectAmount(account);
        account.setUsableAmount(repayment.getUsableAmount().add(tsa.getUsableAmount()));
        int a = accountMapper.updatecoount(account);
        if (a >= 0) {
            TAccountflow f = new TAccountflow();
            f.setAccountId(repayment.getAccountId());
            f.setActionType(3);
            f.setAmount(repayment.getUsableAmount());
            f.setUsableAmount(repayment.getUsableAmount());
            DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
            String time = format.format(new Date());
            Date date = null;
            try {
                date = format.parse(time);
                f.setTradeTime(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            accountflowMapper.addFlow(f);

            TSysTemaccount t = new TSysTemaccount();
            BigDecimal b = new BigDecimal(repayment.getRealityMoney());
            TSysTemaccount ts=sysTemaccountMapper.selectUsableAmount(t);

            t.setUsableAmount(b.add(ts.getUsableAmount()));
            sysTemaccountMapper.updateUsableAmount(t);

            TSysTemaccountflow tf = new TSysTemaccountflow();
            tf.setUsableAmount(b);
            tf.setAmount(b);
            tf.setActionType(3);
            tf.setTradeTime(time);
            sysTemaccountflowMapper.addAccountFlow(tf);
            repayment.setRepayType("已还款");
            repaymentMapper.updateRepayment(repayment);
        } else {

        }

        return a;
    }
}
