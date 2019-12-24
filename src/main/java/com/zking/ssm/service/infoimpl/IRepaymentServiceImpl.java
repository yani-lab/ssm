package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:30
*/

import com.zking.ssm.mapper.info.TRepaymentMapper;
import com.zking.ssm.model.info.TRepayment;
import com.zking.ssm.service.info.IRepaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IRepaymentServiceImpl implements IRepaymentService {
    @Resource
    private TRepaymentMapper repaymentMapper;
    @Override
    public List<TRepayment> listrep(TRepayment repayment) {
        return repaymentMapper.listrep(repayment);
    }

    @Override
    public List<TRepayment> list() {
        return repaymentMapper.list();
    }

    @Override
    public int updaterep(TRepayment repayment) {
        return repaymentMapper.updaterep(repayment);
    }

    @Override
    public List<TRepayment> getByLoId(TRepayment repayment) {
        return repaymentMapper.getByLoId(repayment);
    }
}
