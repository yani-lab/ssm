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
    /**
     * 通过产品名称模糊查询产品
     */
    List<TProducttable> listprodname(TProducttable producttable);
    /**
     * 新增产品
     */
    int addpro(TProducttable producttable);
    /**
     * 修改产品
     */
    int updatepro(TProducttable producttable);
    /**
     * 删除产品
     */
    int delpro(TProducttable producttable);
}
