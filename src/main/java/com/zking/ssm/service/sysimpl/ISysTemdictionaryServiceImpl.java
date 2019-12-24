package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:43
*/

import com.zking.ssm.mapper.sys.TSysTemdictionaryMapper;
import com.zking.ssm.model.sys.TSysTemdictionary;
import com.zking.ssm.service.sys.ISysTemdictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ISysTemdictionaryServiceImpl implements ISysTemdictionaryService {
    @Resource
    private TSysTemdictionaryMapper sysTemdictionaryMapper;
    @Override
    public List<TSysTemdictionary> listtemdict(TSysTemdictionary sysTemdictionary) {
        return sysTemdictionaryMapper.listtemdict(sysTemdictionary);
    }

    @Override
    public int addtemdict(TSysTemdictionary sysTemdictionary) {
        return sysTemdictionaryMapper.addtemdict(sysTemdictionary);
    }

    @Override
    public int updatetemdict(TSysTemdictionary sysTemdictionary) {
        return sysTemdictionaryMapper.updatetemdict(sysTemdictionary);
    }

    @Override
    public int deltemdict(TSysTemdictionary sysTemdictionary) {
        return sysTemdictionaryMapper.deltemdict(sysTemdictionary);
    }

    @Override
    public TSysTemdictionary getById(TSysTemdictionary sysTemdictionary) {
        return sysTemdictionaryMapper.getById(sysTemdictionary);
    }
}
