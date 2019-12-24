package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:29
*/

import com.zking.ssm.model.info.TRealauth;
import org.springframework.stereotype.Service;

@Service
public interface IRealauthService {
    /**
     * 实名认证
     * @param realauth
     * @return
     */
    int addRealauth(TRealauth realauth);
}
