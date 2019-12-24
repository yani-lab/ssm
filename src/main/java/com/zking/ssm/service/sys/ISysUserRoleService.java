package com.zking.ssm.service.sys;
/*
@author yani
@create 2019-12-1216:44
*/

import com.zking.ssm.model.sys.TSysUserRole;

import java.util.List;

public interface ISysUserRoleService {
    /**
     * 通过角色id查询
     */
    List<TSysUserRole> listByRoleId(TSysUserRole sysUserRole);
}
