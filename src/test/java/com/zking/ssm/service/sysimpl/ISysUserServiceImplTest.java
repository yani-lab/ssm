package com.zking.ssm.service.sysimpl;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.PasswordHelper;
import org.junit.Test;
import test.java.com.zking.test.BaseTest;

import javax.annotation.Resource;

import static org.junit.Assert.*;

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
        s.setUserName("护士");
        String salt=PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials("123",salt);
        s.setUserPwd(credentials);
        System.out.println(credentials);
        System.out.println(salt);
        boolean b=PasswordHelper.checkCredentials("123",salt,credentials);
        System.out.println(b);
        TSysUser d=userService.selectCountByUserName(s);
        System.out.println(d);
    }

    @Test
    public void selectCountByUserName() {
    }
}