package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:18
*/

import com.zking.ssm.mapper.info.TAccountMapper;
import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.mapper.info.TAccountMapper;
import com.zking.ssm.mapper.info.TAccountflowMapper;
import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.service.info.IAccountService;
import org.springframework.stereotype.Service;
import com.zking.ssm.service.info.IAccountflowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class IAccountServiceImpl implements IAccountService {
    @Resource
    private TAccountMapper accountMapper;
    @Override
    public TAccount listaccount(TAccount account) {
        return accountMapper.listaccount(account);
    }
    @Resource
    private TAccountMapper accountMapper;
    @Resource
    private TAccountflowMapper accountflowMapper;


    @Override
    public int updatecoount(TAccount account) {
        TAccountflow af=new TAccountflow();

       BigDecimal a= account.getUsableAmount();
        af.setAmount(a);
        af.setActionType(1);
        af.setUsableAmount(account.getUsableAmount());
        af.setAccountId(account.getAcId());
        DateFormat format= new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String time=format.format(new Date());
        try {
            Date date= format.parse(time);
            af.setTradeTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(af.toString());
        int acountf= accountflowMapper.addFlow(af);
        int at=0;
        if(acountf>=1){
            TAccount ta=accountMapper.selectAccount(account);

            BigDecimal bd=ta.getUsableAmount().add(account.getUsableAmount());
            account.setUsableAmount(bd);
            at=accountMapper.updatecoount(account);
        }else{
            new RuntimeException("修改失败");
        }

        return  at;
    }

    @Override
    public TAccount selectAccount(TAccount account) {
        return accountMapper.selectAccount(account);
    }

    @Override
    public int addAccount(TAccount account) {
        return accountMapper.addAccount(account);
    }
}
