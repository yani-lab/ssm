package com.zking.ssm.service.sysimpl;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/*
@author yani
@create 2019-12-1219:12
*/

public class ISysUserServiceImplTest extends BaseTest{
    @Resource
    private ISysUserService sysUserService;

    @Test
    public void list() {
        List<TSysUser> myl=sysUserService.list();
        for (TSysUser u:myl){
            System.out.println(u.toString());
        }
    }
}