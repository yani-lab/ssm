package com.zking.ssm.service.sysimpl;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import org.junit.Test;
import test.java.com.zking.test.BaseTest;

import javax.annotation.Resource;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1514:46
 */
public class ISysUserServiceImplTest extends BaseTest {
    @Resource
    private ISysUserService userService;
    @Test
    public void registerUser() {
        TSysUser s=new TSysUser();
        s.setUserName("lg");
        TSysUser d=userService.selectCountByUserName(s);
        System.out.println(d);


    }

    @Test
    public void login() {
//        String salt = createSalt();
//        System.out.println(salt);
//        System.out.println(salt.length());
//        //凭证+盐加密后得到的密码
//        String credentials = createCredentials("123456", salt);
//        System.out.println(credentials);
//        System.out.println(credentials.length());
//        boolean b = checkCredentials("123456", salt, credentials);
//        System.out.println(b);
        TSysUser s=new TSysUser();
        s.setUserName("雅妮");
        TSysUser u=userService.login("雅妮");
        System.out.println(u.toString());
    }

    @Test
    public void selectCountByUserName() {
    }
}