package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TUserinfo;
import com.zking.ssm.service.info.IUserinfoService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
@author yani
@create 2019-12-1216:04
*/
@RestController
@RequestMapping("/userinfo")
public class TUserinfoController {
    @Resource
    private IUserinfoService userinfoService;
    @RequestMapping("/updateziliao")
    public Object updatezl(@RequestBody TUserinfo userinfo){
        System.out.println(userinfo.toString());
        DataProtocol data=new DataProtocol();
        int n=userinfoService.updateziliao(userinfo);
        if(n>0){
            TUserinfo info=new TUserinfo();
            info.setId(userinfo.getId());
            TUserinfo u=userinfoService.listuserinfo(info);
            data.setCode(1);
            data.setMessage("操作成功");
            data.setData(u);
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }

        return data;
    }
}
