package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:42
*/

import com.zking.ssm.service.sys.ISysTemaccountflowService;

import javax.annotation.Resource;
import java.util.List;
@Service
import javax.annotation.Resource;

@Service
public class ISysTemaccountflowServiceImpl implements ISysTemaccountflowService {
    @Resource
    private TSysTemaccountflowMapper sysTemaccountflowMapper;
    @Override
    public List<TSysTemaccountflow> listflow(TSysTemaccountflow sysTemaccountflow) {
        return sysTemaccountflowMapper.listflow(sysTemaccountflow);
    }
    @Override
    public int addAccountFlow(TSysTemaccountflow sysTemaccountflow) {
        return sysTemaccountflowMapper.addAccountFlow(sysTemaccountflow);
    }
}
