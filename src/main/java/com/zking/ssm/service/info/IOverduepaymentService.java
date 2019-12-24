package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:27
*/

import com.zking.ssm.model.info.TOverduepayment;

import java.util.List;

public interface IOverduepaymentService {
    /**
     * 新增催款表
     */
    int addover(TOverduepayment overduepayment);
    /**
     * 查询状态为未处理的逾期记录
     */
    List<TOverduepayment> listover(TOverduepayment overduepayment);
    /**
     * 修改催款方式
     */
    int updateover(TOverduepayment overduepayment);
}
