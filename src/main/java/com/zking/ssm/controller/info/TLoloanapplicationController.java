package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TLoloanapplication;
import com.zking.ssm.service.info.ILoloanapplicationService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*
@author yani
@create 2019-12-1216:00
*/
@RestController
@RequestMapping("/loloanapplication")
public class TLoloanapplicationController {
    @Resource
    private ILoloanapplicationService iLoloanapplicationService;

    @RequestMapping("/addloloan")
    public Object addlolan(@RequestBody TLoloanapplication tLoloanapplication) {
        //设置时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        tLoloanapplication.setApplicationtime(df.format(new Date()));
        DataProtocol data=new DataProtocol();
        int n=iLoloanapplicationService.addlolan(tLoloanapplication);
        if(n<0){
            data.setMessage("操作失败");
            data.setCode(data.FAIL);
            return data;
        }
        else{
            data.setMessage("操作成功");
            data.setCode(data.SUCCESS);
            return data;
        }
    }
    @RequestMapping("/list")
    public Object list(){
        DataProtocol data=new DataProtocol();
        List<TLoloanapplication> myl=iLoloanapplicationService.list();
        data.setData(myl);
        return data;
    }
    @RequestMapping("/shenhe")
    public Object shenhe(@RequestBody TLoloanapplication loloanapplication){
        System.out.println(loloanapplication.toString());
        DataProtocol data=new DataProtocol();
        //修改状态
        iLoloanapplicationService.updatlol(loloanapplication);
        //新增借款表
        return data;
    }
}