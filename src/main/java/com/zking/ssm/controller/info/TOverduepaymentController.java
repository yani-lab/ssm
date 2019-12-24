package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TOverduepayment;
import com.zking.ssm.model.info.TOverduetype;
import com.zking.ssm.model.info.TRepayment;
import com.zking.ssm.service.info.IOverduepaymentService;
import com.zking.ssm.service.info.IOverduetypeSErvice;
import com.zking.ssm.service.info.IRepaymentService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*
@author yani
@create 2019-12-1216:00
*/
@RestController
@RequestMapping("/overduepavment")
public class TOverduepaymentController {
    @Resource
    private IOverduepaymentService overduepaymentService;
    @Resource
    private IRepaymentService repaymentService;
    @Resource
    private IOverduetypeSErvice overduetypeSErvice;
    @RequestMapping("/addover")
    public Object addover(@RequestBody TOverduepayment overduepayment) throws ParseException {
        DataProtocol data=new DataProtocol();
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        //截止还款日期暂时放在备注里面
        Date date1= format.parse(overduepayment.getRemark());
        //获取当前系统时间
        Date date2=new Date();
        //获取逾期天数
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        if(days>=1&&days<=10){
            overduepayment.setTypeId(1);
        }
        else if(days>=11&&days<=20){
            overduepayment.setTypeId(2);
        }
        else if(days>=21&&days<=30){
            overduepayment.setTypeId(3);
        }
        else if(days>=31&&days<=60){
            overduepayment.setTypeId(4);
        }
        else if(days<=61){
            overduepayment.setTypeId(5);
        }
        overduepayment.setRemark("未处理");
        overduepayment.setDays(days);
        //新增
        int n=overduepaymentService.addover(overduepayment);
        if(n>0){
            TRepayment rep=new TRepayment();
            //状态4为已安排催款
            rep.setRepayType("4");
            rep.setRepId(overduepayment.getOverdueId());
            //把还款表的状态修改为已安排催款
            repaymentService.updaterep(rep);
            data.setCode(1);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
    @RequestMapping("/listover")
    public Object listover(@RequestBody TOverduepayment overduepayment){
        DataProtocol data=new DataProtocol();
        List<TOverduepayment> over=overduepaymentService.listover(overduepayment);
        if(over!=null){
            for(TOverduepayment o:over){
                TOverduetype overtypr=new TOverduetype();
                overtypr.setOvtId(o.getTypeId());
                TOverduetype type= overduetypeSErvice.getById(overtypr);
                o.setTypeName(type.getRange());
            }
           data.setCode(1);
           data.setMessage("操作成功");
           data.setData(over);
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
    @RequestMapping("/updateover")
    public Object updateover(@RequestBody TOverduepayment overduepayment){
        DataProtocol data=new DataProtocol();
        int n= overduepaymentService.updateover(overduepayment);
        if(n>0){
            data.setCode(1);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
}
