package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:32
*/

import com.zking.ssm.model.info.TUserinfo;

public interface IUserinfoService {
    /**
     * 根据id查询用户信息
     */
    TUserinfo listuserinfo(TUserinfo userinfo);
}
