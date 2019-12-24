package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:41
*/

import com.zking.ssm.model.sys.TSysTemaccount;
import org.springframework.stereotype.Service;

@Service
public interface ISysTemaccountService {
    /**
     * 修改系统可以余额
     * @param sysTemaccount
     * @return
     */
    int updateUsableAmount(TSysTemaccount sysTemaccount);
}
