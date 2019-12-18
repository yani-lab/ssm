package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.service.info.IAccountService;
import com.zking.ssm.service.info.IAccountflowService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
@author yani
@create 2019-12-1215:51
*/
@RestController
@RequestMapping("/account")
public class TAccountController {
    @Resource
    private IAccountService accountService;

@RequestMapping("/addAccount")
    public Object addAccountFlow(TAccount account){
        DataProtocol obj = new DataProtocol();

        int as=accountService.updatecoount(account);

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
