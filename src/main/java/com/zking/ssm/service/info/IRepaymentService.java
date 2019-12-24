package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:30
*/

import com.zking.ssm.model.info.TRepayment;

import java.util.List;

public interface IRepaymentService {
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
