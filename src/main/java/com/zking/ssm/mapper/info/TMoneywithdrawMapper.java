package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TMoneywithdraw;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:23
 */
public interface TMoneywithdrawMapper {

    /**
     * 新增提现表
     * @param moneywithdraw
     * @return
     */
    int addDrawMoney(TMoneywithdraw moneywithdraw);

    /**
     * 查询小费的金额
     * @param moneywithdraw
     * @return
     */
    TMoneywithdraw selectDrawMoney(TMoneywithdraw moneywithdraw);
}
