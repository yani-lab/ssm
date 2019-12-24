package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:43
*/

import com.zking.ssm.model.sys.TSysTemdictionaryitem;

import java.util.List;

public interface ISysTemdictionaryitemService {
    /**
     * 查询还款方式
     */
    List<TSysTemdictionaryitem> listtemd(TSysTemdictionaryitem sysTemdictionaryitem);
    /**
     * 通过名称模糊查询
     */
    List<TSysTemdictionaryitem> listtemdict(TSysTemdictionaryitem sysTemdictionaryitem);
    /**
     * 新增
     */
    int addtemdict(TSysTemdictionaryitem sysTemdictionaryitem);
    /**
     * 修改
     */
    int updatetemdict(TSysTemdictionaryitem sysTemdictionaryitem);
    /**
     * 删除
     */
    int deltemdict(TSysTemdictionaryitem sysTemdictionaryitem);
}
