package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:43
*/

import com.zking.ssm.model.sys.TSysTemdictionary;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;

import java.util.List;

public interface ISysTemdictionaryitemService {
    /**
     * 查询还款方式
     */
    List<TSysTemdictionaryitem> listtemd(TSysTemdictionaryitem sysTemdictionaryitem);

    /**
     * 查询还款方式
     * @param temdictionary
     * @return
     */
    TSysTemdictionaryitem selectTitle(TSysTemdictionaryitem temdictionary);
}
