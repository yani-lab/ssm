package com.zking.ssm.service.sys;

import com.zking.ssm.model.sys.TSysTemaccountflow;
import org.springframework.stereotype.Service;

/*
@author yani
@create 2019-12-1216:41
*/
@Service
public interface ISysTemaccountflowService {
    /**
     * 新增系统账户流动数据
     * @param sysTemaccountflow
     * @return
     */
    int addAccountFlow(TSysTemaccountflow sysTemaccountflow);
}
