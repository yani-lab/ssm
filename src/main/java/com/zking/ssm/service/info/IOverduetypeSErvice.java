package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:27
*/

import com.zking.ssm.model.info.TOverduetype;

public interface IOverduetypeSErvice {
    /**
     * 通过id查询逾期类型
     */
    TOverduetype getById(TOverduetype overduetype);
}
