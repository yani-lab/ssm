package com.zking.ssm.mapper.sys;

import com.zking.ssm.model.sys.TSysUserRole;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:30
 */
public interface TSysUserRoleMapper {
    /**
     * 通过角色id查询
     */
    List<TSysUserRole> listByRoleId(TSysUserRole sysUserRole);
}
