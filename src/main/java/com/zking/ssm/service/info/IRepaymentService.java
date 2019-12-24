package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:30
*/

import com.zking.ssm.model.info.TRepayment;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    /**
     * 根据投资标id查询所有还款项
     * @param repayment
     * @return
     */
    List<TRepayment> selectRepayment(TRepayment repayment, PageBean pageBean);
    /**
     * 根据还款表id修改还款状态
     * @param repayment
     * @return
     */
    int updateRepayment(TRepayment repayment);
}
