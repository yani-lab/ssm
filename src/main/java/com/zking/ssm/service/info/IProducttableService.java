package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:29
*/

import com.zking.ssm.model.info.TProducttable;

import java.util.List;

public interface IProducttableService {
    /**
     * 查询所有产品
     * @return
     */
    List<TProducttable> listprod();
}
