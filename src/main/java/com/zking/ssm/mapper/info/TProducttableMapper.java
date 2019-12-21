package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TProducttable;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:25
 */
public interface TProducttableMapper {
    /**
     * 查询所有产品
     */
    List<TProducttable> listprod();
}
