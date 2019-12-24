package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:27
*/

import com.zking.ssm.mapper.info.TOverduetypeMapper;
import com.zking.ssm.model.info.TOverduetype;
import com.zking.ssm.service.info.IOverduetypeSErvice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IOverduetypeSErviceImpl implements IOverduetypeSErvice {
    @Resource
    private TOverduetypeMapper overduetypeMapper;
    @Override
    public TOverduetype getById(TOverduetype overduetype) {
        return overduetypeMapper.getById(overduetype);
    }
}
