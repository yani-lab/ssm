package com.zking.ssm.mapper.sys;

import com.zking.ssm.model.sys.TSysMenu;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:28
 */
public interface TSysMenuMapper {

    List<TSysMenu> getmenu(TSysMenu sysMenu);
}
