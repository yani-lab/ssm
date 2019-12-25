package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:25
*/

import com.zking.ssm.model.info.TLoloanapplication;

import java.util.List;

public interface ILoloanapplicationService {
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
