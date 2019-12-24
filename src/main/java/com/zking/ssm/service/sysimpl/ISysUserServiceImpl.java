package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:44
*/

import com.zking.ssm.mapper.sys.TSysUserMapper;
import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.PasswordHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ISysUserServiceImpl implements ISysUserService {
    @Resource
    private TSysUserMapper sysUserMapper;


    @Override
    public int RegisterUser(TSysUser user) {
        TSysUser u=sysUserMapper.selectCountByUserName(user);

        if(u==null){
            String salt= PasswordHelper.createSalt();
            String userPwd= PasswordHelper.createCredentials(user.getUserPwd(),salt);
            user.setUserPwd(userPwd);
            user.setSalt(salt);
            int us= sysUserMapper.RegisterUser(user);
            return us;
        }else{
            new RuntimeException("用户名已存在");
            return 0;
        }
        

    }

    @Override
    public TSysUser login(String username) {

//        TSysUser us = sysUserMapper.login(username);
//        String salt = PasswordHelper.createSalt();
//        String userPwd = PasswordHelper.createCredentials(user.getUserPwd(), salt);
////        String userName = user.getUserName();
//        user.setUserPwd(userPwd);
//        user.setSalt(salt);
//        boolean b=PasswordHelper.checkCredentials(us.getUserPwd(),salt,userPwd);
//        if(b==true){
//
//            return  us;
//        }else{
//            return null;
//        }
        return sysUserMapper.login(username);
    }

    @Override
    public TSysUser selectCountByUserName(TSysUser user) {

        return sysUserMapper.selectCountByUserName(user);
    }

    @Override
    public TSysUser getById(TSysUser sysUser) {
        return sysUserMapper.getById(sysUser);
    }


}
