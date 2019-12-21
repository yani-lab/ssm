package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:27
*/

import com.zking.ssm.mapper.info.TAccountMapper;
import com.zking.ssm.mapper.info.TAccountflowMapper;
import com.zking.ssm.mapper.info.TMoneywithdrawMapper;
import com.zking.ssm.mapper.sys.TSysTemaccountMapper;
import com.zking.ssm.mapper.sys.TSysTemaccountflowMapper;
import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.model.info.TMoneywithdraw;
import com.zking.ssm.model.sys.TSysTemaccount;
import com.zking.ssm.model.sys.TSysTemaccountflow;
import com.zking.ssm.service.info.IMoneywithdrawService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class IMoneywithdrawServiceImpl implements IMoneywithdrawService {
    @Resource
    private TMoneywithdrawMapper moneywithdrawMapper;
    @Resource
    private TSysTemaccountMapper sysTemaccountMapper;
    @Resource
    private TSysTemaccountflowMapper sysTemaccountflowMapper;
    @Resource
    private TAccountMapper accountMapper;
    @Resource
    private TAccountflowMapper accountflowMapper;

    @Override
    public int addDrawMoney(TMoneywithdraw money) {

        //新增系统提现记录
        money.setState(2);
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String time = format.format(new Date());
        Date d = null;
        try {
            d = format.parse(time);
            money.setApplyTime(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int m = moneywithdrawMapper.addDrawMoney(money);

        if (m >= 1) {
            //新增账户交易记录
            TAccountflow tflow = new TAccountflow();
            tflow.setUsableAmount(money.getAmount());
            tflow.setTradeTime(d);
            tflow.setActionType(2);
            tflow.setAmount(money.getAmount());
            tflow.setAccountId(money.getAccountId());
            accountflowMapper.addFlow(tflow);

            //修改提现金额
            TAccount ta = new TAccount();
            ta.setUserId(money.getApplierId());
            //查询当前金额-提现金额
            TAccount account = accountMapper.selectAmount(ta);
            ta.setUsableAmount(account.getUsableAmount().subtract(money.getAmount()));
            accountMapper.updatecoount(ta);
            //修改系统金额
            TSysTemaccount tSysTemaccount = new TSysTemaccount();
            TMoneywithdraw t = selectDrawMoney(money);

            tSysTemaccount.setUsableAmount(t.getFee());
            sysTemaccountMapper.updateUsableAmount(tSysTemaccount);
            //新增系统账户流动数据
            TSysTemaccountflow tf = new TSysTemaccountflow();
            tf.setActionType(1);
            tf.setAmount(money.getAmount());
            tf.setUsableAmount(money.getAmount());
            tf.setTradeTime(d);
            sysTemaccountflowMapper.addAccountFlow(tf);
        }
        return m;
    }

    @Override
    public TMoneywithdraw selectDrawMoney(TMoneywithdraw moneywithdraw) {
        return moneywithdrawMapper.selectDrawMoney(moneywithdraw);
    }


}
