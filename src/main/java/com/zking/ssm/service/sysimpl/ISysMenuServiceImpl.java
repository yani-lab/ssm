package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:34
*/

import com.zking.ssm.mapper.sys.TSysMenuMapper;
import com.zking.ssm.model.sys.TSysMenu;
import com.zking.ssm.service.sys.ISysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ISysMenuServiceImpl implements ISysMenuService {

    @Resource
    private TSysMenuMapper sysMenuMapper;
    @Override
    public List<TSysMenu> getmenu(TSysMenu sysMenu) {
        return sysMenuMapper.getmenu(sysMenu);
    }
}
