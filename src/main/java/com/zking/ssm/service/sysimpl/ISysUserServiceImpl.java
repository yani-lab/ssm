package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:44
*/

import com.zking.ssm.mapper.sys.TSysUserMapper;
import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ISysUserServiceImpl implements ISysUserService {
    @Resource
    private TSysUserMapper sysUserMapper;

    @Override
    public List<TSysUser> list() {
        return sysUserMapper.list();
    }
}
