package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.DataProtocol;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
@author yani
@create 2019-12-1215:49
*/
@RestController
@RequestMapping("/user")
public class TSysUserController {
    @Resource
    private ISysUserService sysUserService;
    @RequestMapping("/register")
    public Object  regiestUser(TSysUser sysUser){
        DataProtocol obj = new DataProtocol();
        int u=sysUserService.RegisterUser(sysUser);
       if(u>=1){
           obj.setCode(DataProtocol.SUCCESS);
           obj.setMessage("注册成功");
       }else{           obj.setCode(DataProtocol.FAIL);
           obj.setMessage("注册失败");
       }
        return obj;
    }
@RequestMapping("/login")
    public Object login(TSysUser user){
        DataProtocol data = new DataProtocol();
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(),user.getUserPwd());
        try {
            subject.login(token);
            data.setData(sysUserService.login(user.getUserName()));
            data.setCode(DataProtocol.SUCCESS);
            data.setMessage("登录成功");
        }catch (AuthenticationException ex){
            data.setCode(DataProtocol.FAIL);
            data.setMessage("登录失败");
        }
        return data;

    }
}
