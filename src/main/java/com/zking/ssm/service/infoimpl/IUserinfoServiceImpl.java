package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:32
*/

import com.zking.ssm.mapper.info.TUserinfoMapper;
import com.zking.ssm.model.info.TUserinfo;
import com.zking.ssm.service.info.IUserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IUserinfoServiceImpl implements IUserinfoService {
    @Resource
    private TUserinfoMapper userinfoMapper;
    @Override
    public TUserinfo listuserinfo(TUserinfo userinfo) {
        return userinfoMapper.listuserinfo(userinfo);
    }
}
