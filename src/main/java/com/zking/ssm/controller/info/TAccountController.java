package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.service.info.IAccountService;
import com.zking.ssm.service.info.IAccountflowService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
@author yani
@create 2019-12-1215:51
*/
@RestController
@RequestMapping("/account")
public class TAccountController {
    @Resource
    private IAccountService accountService;
@Resource
private IAccountflowService accountflowService;
@RequestMapping("/addAccount")
    public Object addAccountFlow(@RequestBody TAccount account) throws ParseException {
        DataProtocol obj = new DataProtocol();

        int as=accountService.updatecoount(account);
    //增加流水
    TAccountflow accountflow=new TAccountflow();
    accountflow.setAmount(account.getUsableAmount());
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    Date date=df.parse(df.format(new Date()));
    accountflow.setTradeTime(date);
    //1=投资
    accountflow.setActionType(2);
    accountflow.setNote("充值收入");
    //投资账户id
    accountflow.setAccountId(account.getAcId());
    accountflow.setUsableAmount(account.getUsableAmount());
    int n1=accountflowService.addFlow(accountflow);
        if(as>=0){
            obj.setCode(DataProtocol.SUCCESS);
            obj.setMessage("充值成功");
        }else{
            obj.setCode(DataProtocol.FAIL);
            obj.setMessage("充值失败");
        }
        return obj;
    }
}
