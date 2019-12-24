package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TRealauth;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:25
 */
public interface TRealauthMapper {
    /**
     * 实名认证
     * @param realauth
     * @return
     */
    int addRealauth(TRealauth realauth);
}
