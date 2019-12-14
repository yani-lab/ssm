package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:44
*/

import com.zking.ssm.model.sys.TSysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface ISysUserService {
    /**
     * 用户注册
     * @param user
     * @return
     */
    void   RegisterUser(TSysUser user);
    /**
     * 通过用户名称获取用户信息
     * @param userName 用户名称
     * @return TSysUser 系统用户实体对象
     */
    String login(@Param("userName")String userName);
}
