package com.zking.ssm.mapper.sys;

import com.zking.ssm.model.sys.TSysUser;
import org.apache.ibatis.annotations.Param;

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
    void   RegisterUser(TSysUser user);
    /**
     * 通过用户名称获取用户信息
     * @param userName 用户名称
     * @return TSysUser 系统用户实体对象
     */
    String login(@Param("userName")String userName);
}
