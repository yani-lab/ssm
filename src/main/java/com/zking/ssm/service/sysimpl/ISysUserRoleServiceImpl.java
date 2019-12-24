package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:44
*/

import com.zking.ssm.mapper.sys.TSysUserRoleMapper;
import com.zking.ssm.model.sys.TSysUserRole;
import com.zking.ssm.service.sys.ISysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ISysUserRoleServiceImpl implements ISysUserRoleService {
    @Resource
    private TSysUserRoleMapper sysUserRoleMapper;
    @Override
    public List<TSysUserRole> listByRoleId(TSysUserRole sysUserRole) {
        return sysUserRoleMapper.listByRoleId(sysUserRole);
    }
}
