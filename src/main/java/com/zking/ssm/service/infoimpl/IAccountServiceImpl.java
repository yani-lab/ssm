package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:18
*/

import com.zking.ssm.mapper.info.TAccountMapper;
import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.service.info.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IAccountServiceImpl implements IAccountService {
    @Resource
    private TAccountMapper accountMapper;
    @Override
    public TAccount listaccount(TAccount account) {
        return accountMapper.listaccount(account);
    }
}
