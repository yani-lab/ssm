package com.zking.ssm.service.info;

import com.zking.ssm.mapper.info.TMoneywithdrawMapper;
import com.zking.ssm.model.info.TMoneywithdraw;
import org.springframework.stereotype.Service;

/*
@author yani
@create 2019-12-1216:26
*/
@Service
public interface IMoneywithdrawService {
    /**
     * 新增提现表
     * @param money
     * @return
     */
    int addDrawMoney(TMoneywithdraw money);
    /**
     * 查询小费的金额
     * @param moneywithdraw
     * @return
     */
    TMoneywithdraw selectDrawMoney(TMoneywithdraw moneywithdraw);
}
