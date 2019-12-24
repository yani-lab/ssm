package com.zking.ssm.service.info;

import com.zking.ssm.model.info.TRepayment;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author yani
@create 2019-12-1216:30
*/
@Service
public interface IRepaymentService {
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
