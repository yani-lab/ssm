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
    /**
     * 修改个人资料
     */
    int updateziliao(TUserinfo userinfo);
}
