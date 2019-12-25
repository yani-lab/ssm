package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:25
*/

import com.zking.ssm.mapper.info.TLoloanapplicationMapper;
import com.zking.ssm.model.info.TLoloanapplication;
import com.zking.ssm.service.info.ILoloanapplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ILoloanapplicationServiceImpl implements ILoloanapplicationService {
    @Resource
    private TLoloanapplicationMapper loloanapplicationMapper;
    @Override
    public int addlolan(TLoloanapplication loloanapplication) {
        return loloanapplicationMapper.addlolan(loloanapplication);
    }

    @Override
    public List<TLoloanapplication> list() {
        return loloanapplicationMapper.list();
    }

    @Override
    public int updatlol(TLoloanapplication loloanapplication) {
        return loloanapplicationMapper.updatlol(loloanapplication);
    }
}
