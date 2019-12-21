package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:18
*/

import com.zking.ssm.model.info.TAccount;
import org.springframework.stereotype.Service;

@Service
public interface IAccountService {
    /**
     * 修改充值金额
     * @param account
     * @return
     */
    int updatecoount(TAccount account);

    /**
     * 新增账户
     * @param account
     * @return
     */
    int addAccount(TAccount account);
    /**
     * 查询账户余额
     * @param account
     * @return
     */
    TAccount selectAmount(TAccount account);

}
