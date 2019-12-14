package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:44
*/

import com.zking.ssm.mapper.sys.TSysUserMapper;
import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ISysUserServiceImpl implements ISysUserService {
    @Resource
    private TSysUserMapper sysUserMapper;


    @Override
    public void RegisterUser(TSysUser user) {

        sysUserMapper.RegisterUser(user);
    }

    @Override
    public String login(String userName) {
        return sysUserMapper.login(userName);
    }
}
