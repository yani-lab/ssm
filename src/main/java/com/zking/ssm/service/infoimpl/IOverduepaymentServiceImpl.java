package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:27
*/

import com.zking.ssm.mapper.info.TOverduepaymentMapper;
import com.zking.ssm.model.info.TOverduepayment;
import com.zking.ssm.service.info.IOverduepaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IOverduepaymentServiceImpl implements IOverduepaymentService {
    @Resource
    private TOverduepaymentMapper overduepaymentMapper;
    @Override
    public int addover(TOverduepayment overduepayment) {
        return overduepaymentMapper.addover(overduepayment);
    }

    @Override
    public List<TOverduepayment> listover(TOverduepayment overduepayment) {
        return overduepaymentMapper.listover(overduepayment);
    }

    @Override
    public int updateover(TOverduepayment overduepayment) {
        return overduepaymentMapper.updateover(overduepayment);
    }
}
