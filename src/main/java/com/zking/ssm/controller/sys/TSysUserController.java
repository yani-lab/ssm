package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.PasswordHelper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/*
@author yani
@create 2019-12-1215:49
*/
@Controller
@RequestMapping("/user")
public class TSysUserController {
    @Resource
    private ISysUserService sysUserService;
    @RequestMapping("/register")
    public void regiestUser(TSysUser sysUser){
        String salt=PasswordHelper.createSalt();
       String userPwd= PasswordHelper.createCredentials(sysUser.getUserPwd(),salt);
        sysUser.setUserPwd(userPwd);
        sysUser.setSalt(salt);
        sysUserService.RegisterUser(sysUser);

    }

    public void login(TSysUser user){
        String userName=user.getUserName();
        String userPwd=user.getUserPwd();

        String Pwd= PasswordHelper.createCredentials(userPwd,user.getSalt());
        boolean b = PasswordHelper.checkCredentials(userPwd,user.getSalt(),Pwd);

        sysUserService.login(userName);
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(),user.getUserPwd());
        subject.login(token);
    }
}
