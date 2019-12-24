package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:41
*/

import com.zking.ssm.model.sys.TSysTemaccountflow;

import java.util.List;

public interface ISysTemaccountflowService {
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
