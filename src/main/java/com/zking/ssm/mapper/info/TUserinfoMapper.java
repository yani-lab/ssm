package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TUserinfo;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:27
 */
public interface TUserinfoMapper {
    /**
     * 根据id查询用户信息
     */
    TUserinfo listuserinfo(TUserinfo userinfo);
}
