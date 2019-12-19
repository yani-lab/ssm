package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:18
*/

import com.zking.ssm.model.info.TAccount;

public interface IAccountService {
    /**
     * 通过用户id查询
     */
    TAccount listaccount(TAccount account);
}
