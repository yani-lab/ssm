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
     * 根据投资标id查询所有还款项
     * @param repayment
     * @return
     */
    List<TRepayment> selectRepayment(TRepayment repayment);

    /**
     * 根据还款表id修改还款状态
     * @param repayment
     * @return
     */
   int updateRepayment(TRepayment repayment);
}
