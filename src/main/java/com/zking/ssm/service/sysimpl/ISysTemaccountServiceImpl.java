package com.zking.ssm.service.sysimpl;
/*
@author yani
@create 2019-12-1216:41
*/

import com.zking.ssm.mapper.sys.TSysTemaccountMapper;
import com.zking.ssm.model.sys.TSysTemaccount;
import com.zking.ssm.service.sys.ISysTemaccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ISysTemaccountServiceImpl implements ISysTemaccountService {
    @Resource
    private TSysTemaccountMapper sysTemaccountMapper;
    @Override
    public int updateUsableAmount(TSysTemaccount sysTemaccount) {
        return sysTemaccountMapper.updateUsableAmount(sysTemaccount);
    }
}
