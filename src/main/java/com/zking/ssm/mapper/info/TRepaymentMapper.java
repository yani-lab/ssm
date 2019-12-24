package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TRepayment;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:26
 */
public interface TRepaymentMapper {
    /**
     * 通过状态查询还款
     */
    List<TRepayment> listrep(TRepayment repayment);
    /**
     * 查询还款
     */
    List<TRepayment> list();
    /**
     * 通过id修改还款
     */
    int updaterep(TRepayment repayment);
    /**
     * 通过贷款id查询还款记录
     */
    List<TRepayment> getByLoId(TRepayment repayment);
}
