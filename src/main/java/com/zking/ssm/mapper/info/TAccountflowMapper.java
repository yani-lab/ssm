package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TAccountflow;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:19
 */
public interface TAccountflowMapper {
    /**
     * 新增充值金额
     * @param accountflow
     * @return
     */
    int addFlow(TAccountflow accountflow);

    /**
     * 查询充值记录
     * @param accountflow
     * @return
     */
    List<TAccountflow> AllRecordpaging(TAccountflow accountflow);
    /**
     * 查询可用余额
     * @param account
     * @return
     */
    TAccountflow selectFlowAccount(TAccountflow account);
}
