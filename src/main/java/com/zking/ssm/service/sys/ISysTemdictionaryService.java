package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:43
*/

import com.zking.ssm.model.sys.TSysTemdictionary;

import java.util.List;

public interface ISysTemdictionaryService {
    /**
     * 查询所有数据字典分类
     */
    List<TSysTemdictionary> listtemdict(TSysTemdictionary sysTemdictionary);
    /**
     * 新增数据字典分类
     */
    int addtemdict(TSysTemdictionary sysTemdictionary);
    /**
     * 修改数据字典分类
     */
    int updatetemdict(TSysTemdictionary sysTemdictionary);
    /**
     * 删除数据字典分类
     */
    int deltemdict(TSysTemdictionary sysTemdictionary);
    /**
     * 通过id查询
     */
    TSysTemdictionary getById(TSysTemdictionary sysTemdictionary);
}
