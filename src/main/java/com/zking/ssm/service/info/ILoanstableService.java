package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:24
*/

import com.zking.ssm.model.info.TLoanstable;

import java.util.List;

public interface ILoanstableService {
    /**
     * 查询所有贷款记录
     */
    List<TLoanstable> listloanst(TLoanstable loanstable);
    /**
     * 新增贷款记录
     */
    int addloanst(TLoanstable loanstable);
    /**
     * 查询最新一条的贷款记录
     */
    TLoanstable listxin();
    /**
     * 查询用户的贷款记录
     */
    List<TLoanstable> listloan(TLoanstable loanstable);
}
