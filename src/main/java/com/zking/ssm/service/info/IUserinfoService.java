package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:32
*/

import com.zking.ssm.model.info.TUserinfo;
import org.springframework.stereotype.Service;

@Service
public interface IUserinfoService {
    /**
     * 新增用户信息
     * @param userinfo
     * @return
     */
    int addUserinfo(TUserinfo userinfo);
}
