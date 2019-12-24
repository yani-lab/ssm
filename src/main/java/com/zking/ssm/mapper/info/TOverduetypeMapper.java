package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TOverduetype;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:23
 */
public interface TOverduetypeMapper {
    /**
     * 通过id查询逾期类型
     */
    TOverduetype getById(TOverduetype overduetype);
}
