package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:19
*/

import com.zking.ssm.model.info.TAccountflow;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAccountflowService {
    /**
     * 新增流动金额
     * @param accountflow
     * @return
     */
    int addFlow(TAccountflow accountflow);
    /**
     * 查询充值记录
     * @param accountflow
     * @return
     */
    List<TAccountflow> AllRecord(TAccountflow accountflow);
}
