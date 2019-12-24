package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TLoanstable;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:21
 */
public interface TLoanstableMapper {
    /**
     * 查询所有贷款记录
     */
    List<TLoanstable> listloanst(TLoanstable loanstable);
}
