package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TAccount;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:18
 */
public interface TAccountMapper {
    /**
     * 通过用户id查询
     */
    TAccount listaccount(TAccount account);
}
