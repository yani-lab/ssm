package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.PasswordHelper;
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
        PasswordHelper.createSalt();
        PasswordHelper.createCredentials(sysUser.getUserPwd(),sysUser.getUserPwd());


        sysUserService.RegisterUser(sysUser);


    }
}
