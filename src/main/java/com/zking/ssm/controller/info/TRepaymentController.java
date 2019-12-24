package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TRepayment;
import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.info.IRepaymentService;
import com.zking.ssm.service.sys.ISysUserService;
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
@create 2019-12-1216:03
*/
@RestController
@RequestMapping("/repayment")
public class TRepaymentController {
    @Resource
    private IRepaymentService repaymentService;
    @Resource
    private ISysUserService sysUserService;
    @RequestMapping("/listrep")
    public Object listpre(@RequestBody TRepayment repayment) throws ParseException {
        DataProtocol data=new DataProtocol();
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        //获取系统当前时间
        String time=format.format(new Date());
        //把当前系统时间转换为date类型
        Date a= format.parse(time);
        //查询所有未还款的还款
        List<TRepayment> myl=repaymentService.list();
        for(TRepayment r:myl){
            System.out.println(r.toString());
            //把未还款的每个记录的截止还款时间转换为date类型
            Date b=format.parse(r.getRefuTime());
            //判断所有未还款的还款截止日期和当前系统时间是否逾期
            if(b.before(a)){
                System.out.println("-----------2222222222222222222");
            //如果r的还款截止时间早于当前系统时间，那么就说明此还款记录已逾期，需要把状态修改为已逾期
                TRepayment rep=new TRepayment();
                //状态列3为逾期状态
                rep.setRepayType("3");
                rep.setRepId(r.getRepId());
                repaymentService.updaterep(rep);
            }
        }
        //查询状态为逾期状态的所有记录
        repayment.setRepayType("3");
        List<TRepayment> rep=repaymentService.listrep(repayment);
        TSysUser user=new TSysUser();
        for(TRepayment p:rep){
            user.setUserId(p.getUserId());
            TSysUser u=sysUserService.getById(user);
            if(u!=null){
                p.setUserName(u.getUserName());
            }
        }
        if(rep!=null){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(rep);
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
        }
        return data;
    }
    @RequestMapping("/getByLoId")
    public Object getByLoId(@RequestBody TRepayment repayment){
        System.out.println(repayment.toString());
        DataProtocol data=new DataProtocol();
        List<TRepayment> myl = repaymentService.getByLoId(repayment);
        if(myl!=null){
            TSysUser user=new TSysUser();
            for(TRepayment p:myl){
                user.setUserId(p.getUserId());
                TSysUser u=sysUserService.getById(user);
                if(u!=null){
                    p.setUserName(u.getUserName());
                }
            }
            data.setCode(1);
            data.setMessage("操作成功");
            data.setData(myl);
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
}
