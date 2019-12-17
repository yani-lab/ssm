package com.zking.ssm.mapper.sys;

import com.zking.ssm.model.sys.TSysUser;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:30
 */
public interface TSysUserMapper {
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
    TSysUser login(String username);

    /**
     * 查询用户名是否已有
     * @param user 用户名称
     * @return TSysUser 系统用户实体对象
     */
    TSysUser selectCountByUserName(TSysUser user);

}
