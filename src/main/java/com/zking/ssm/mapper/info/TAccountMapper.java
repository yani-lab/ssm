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
    /**
     * 修改账户的可用余额（用于投资）
     */
    int updateaccount(TAccount account);

    /**
     * 修改账户的可用余额（用于贷款）
     */
    int updateac(TAccount account);
}
