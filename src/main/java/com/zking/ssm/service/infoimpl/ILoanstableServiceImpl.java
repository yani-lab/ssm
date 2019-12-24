package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:24
*/

import com.zking.ssm.mapper.info.TLoanstableMapper;
import com.zking.ssm.model.info.TLoanstable;
import com.zking.ssm.service.info.ILoanstableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ILoanstableServiceImpl implements ILoanstableService {
    @Resource
    private TLoanstableMapper loanstableMapper;
    @Override
    public List<TLoanstable> listloanst(TLoanstable loanstable) {
        return loanstableMapper.listloanst(loanstable);
    }
}
