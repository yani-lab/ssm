package com.zking.ssm.mapper.sys;

import com.zking.ssm.model.sys.TSysTemdictionary;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:30
 */
public interface TSysTemdictionaryitemMapper {
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
