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


    @Override
    public int updatecoount(TAccount account) {
        return  accountMapper.updateac(account);
    }



    @Override
    public int addAccount(TAccount account) {
        return accountMapper.addAccount(account);
    }

    @Override
    public TAccount selectAmount(TAccount account) {
        return accountMapper.selectAmount(account);
    }

    @Override
    public int updateaccount(TAccount account) {
        return accountMapper.updateaccount(account);
    }

    @Override
    public int updateac(TAccount account) {
        return accountMapper.updateac(account);
    }
}
