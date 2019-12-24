package com.zking.ssm.mapper.sys;

import com.zking.ssm.model.sys.TSysTemaccountflow;

import java.util.List;

import com.zking.ssm.model.sys.TSysTemaccountflow;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:29
 */
public interface TSysTemaccountflowMapper {
    /**
     * 查询所有账户流水
     */
    List<TSysTemaccountflow> listflow(TSysTemaccountflow sysTemaccountflow);

    /**
     * 新增系统账户流动数据
     * @param sysTemaccountflow
     * @return
     */
    int addAccountFlow(TSysTemaccountflow sysTemaccountflow);
}
