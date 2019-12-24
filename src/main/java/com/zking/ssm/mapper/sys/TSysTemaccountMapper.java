package com.zking.ssm.mapper.sys;

import com.zking.ssm.model.sys.TSysTemaccount;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:29
 */
public interface TSysTemaccountMapper {
    /**
     * 查询系统账户
     */
    TSysTemaccount listaccount();
    /**
     * 修改系统可以余额
     * @param sysTemaccount
     * @return
     */
    int updateUsableAmount(TSysTemaccount sysTemaccount);

    /**
     * 查询系统账户可用余额
     * @param sysTemaccount
     * @return
     */
    TSysTemaccount selectUsableAmount(TSysTemaccount sysTemaccount);
}
