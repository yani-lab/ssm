package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:19
*/

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.info.TAccountMapper;
import com.zking.ssm.mapper.info.TAccountflowMapper;
import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.service.info.IAccountflowService;
import com.zking.ssm.util.PageBean;
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
    public List<TAccountflow> AllRecordpaging(TAccountflow accountflow, PageBean pageBean) {
        if(pageBean!=null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        //前台传查询的类型
//        accountflow.setActionType(1);
        List<TAccountflow> list=accountflowMapper.AllRecordpaging(accountflow);
        if(pageBean!=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return list;
    }

    @Override
    public TAccountflow selectFlowAccount(TAccountflow account) {
        return accountflowMapper.selectFlowAccount(account);
    }
}
