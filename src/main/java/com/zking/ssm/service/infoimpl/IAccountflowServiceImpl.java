package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:19
*/

import com.zking.ssm.mapper.info.TAccountMapper;
import com.zking.ssm.mapper.info.TAccountflowMapper;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.service.info.IAccountflowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IAccountflowServiceImpl implements IAccountflowService {
    @Resource
    private TAccountflowMapper accountflowMapper;
    @Override
    public int addFlow(TAccountflow accountflow) {
        return accountflowMapper.addFlow(accountflow);
    }

    @Override
    public List<TAccountflow> AllRecord(TAccountflow accountflow) {
        return accountflowMapper.AllRecord(accountflow);
    }
}
