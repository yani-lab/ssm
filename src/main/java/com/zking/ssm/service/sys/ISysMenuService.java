package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:33
*/

import com.zking.ssm.model.sys.TSysMenu;

import java.util.List;

public interface ISysMenuService {

    List<TSysMenu> getmenu(TSysMenu sysMenu);
}
