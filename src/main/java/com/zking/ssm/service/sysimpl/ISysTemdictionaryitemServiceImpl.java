package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:43
*/

import com.zking.ssm.mapper.sys.TSysTemdictionaryitemMapper;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;
import com.zking.ssm.service.sys.ISysTemdictionaryitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ISysTemdictionaryitemServiceImpl implements ISysTemdictionaryitemService {
    @Resource
    private TSysTemdictionaryitemMapper sysTemdictionaryitemMapper;
    @Override
    public List<TSysTemdictionaryitem> listtemd(TSysTemdictionaryitem sysTemdictionaryitem) {
        return sysTemdictionaryitemMapper.listtemd(sysTemdictionaryitem);
    }

    @Override
    public List<TSysTemdictionaryitem> listtemdict(TSysTemdictionaryitem sysTemdictionaryitem) {
        return sysTemdictionaryitemMapper.listtemdict(sysTemdictionaryitem);
    }

    @Override
    public int addtemdict(TSysTemdictionaryitem sysTemdictionaryitem) {
        return sysTemdictionaryitemMapper.addtemdict(sysTemdictionaryitem);
    }

    @Override
    public int updatetemdict(TSysTemdictionaryitem sysTemdictionaryitem) {
        return sysTemdictionaryitemMapper.updatetemdict(sysTemdictionaryitem);
    }

    @Override
    public int deltemdict(TSysTemdictionaryitem sysTemdictionaryitem) {
        return sysTemdictionaryitemMapper.deltemdict(sysTemdictionaryitem);
    }

    @Override
    public TSysTemdictionaryitem selectTitle(TSysTemdictionaryitem temdictionary) {
        return sysTemdictionaryitemMapper.selectTitle(temdictionary);
    }
}
