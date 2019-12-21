package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:42
*/

import com.zking.ssm.mapper.sys.TSysTemaccountflowMapper;
import com.zking.ssm.model.sys.TSysTemaccountflow;
import com.zking.ssm.service.sys.ISysTemaccountflowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ISysTemaccountflowServiceImpl implements ISysTemaccountflowService {
    @Resource
    private TSysTemaccountflowMapper sysTemaccountflowMapper;
    @Override
    public int addAccountFlow(TSysTemaccountflow sysTemaccountflow) {
        return sysTemaccountflowMapper.addAccountFlow(sysTemaccountflow);
    }
}
