package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TLoloanapplication;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:22
 */
public interface TLoloanapplicationMapper {
    /**
     * 新增申请贷款表
     */
    int addlolan(TLoloanapplication loloanapplication);
    /**
     * 查询未审核的贷款表
     */
    List<TLoloanapplication> list();
    /**
     * 修改
     */
    int updatlol(TLoloanapplication loloanapplication);
}
