package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:32
*/

import com.zking.ssm.model.info.TUserinfo;

import com.zking.ssm.model.info.TUserinfo;
import org.springframework.stereotype.Service;

@Service
public interface IUserinfoService {
    /**
     * 根据id查询用户信息
     */
    TUserinfo listuserinfo(TUserinfo userinfo);
    /**
     * 新增用户信息
     * @param userinfo
     * @return
     */
    int addUserinfo(TUserinfo userinfo);
    /**
     *修改实名认证
     * @param userinfo
     * @return
     */
    int updateRealauthId(TUserinfo userinfo);
}
