package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:18
*/

import com.zking.ssm.model.info.TAccount;

import com.zking.ssm.model.info.TAccount;
import org.springframework.stereotype.Service;

@Service
public interface IAccountService {
    /**
     * 通过用户id查询
     */
    TAccount listaccount(TAccount account);
    /**
     * 修改充值金额
     * @param account
     * @return
     */
    int updatecoount(TAccount account);
    /**
     * 查询可用余额
     * @param account
     * @return
     */
    TAccount selectAccount(TAccount account);
    /**
     * 新增账户
     * @param account
     * @return
     */
    int addAccount(TAccount account);
}
