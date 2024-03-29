package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:44
*/

import com.zking.ssm.model.sys.TSysUser;
import org.springframework.stereotype.Service;

@Service
public interface ISysUserService {
    /**
     * 用户注册
     * @param user
     * @return
     */
    int RegisterUser(TSysUser user);
    /**
     * 通过用户名称获取用户信息
     * @param userName 用户名称
     * @return TSysUser 系统用户实体对象
     */
    TSysUser login(String userName);

    /**
     * 查询用户名是否已有
     * @param user 用户名称
     * @return TSysUser 系统用户实体对象
     */
    TSysUser selectCountByUserName(TSysUser user);
    /**
     * 通过id查询
     */
    TSysUser getById(TSysUser sysUser);


}
