package com.zking.ssm.controller.sys;
/*
@author yani
@create 2019-12-1215:48
*/

import com.zking.ssm.model.sys.TSysTemaccount;
import com.zking.ssm.service.sys.ISysTemaccountService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/account")
public class TSysTemaccountController {
    @Resource
    private ISysTemaccountService sysTemaccountService;

    @RequestMapping("/listacc")
    public Object listacc(){
        DataProtocol data=new DataProtocol();
        TSysTemaccount account=sysTemaccountService.listaccount();
        if(account!=null){
            data.setCode(1);
            data.setMessage("操作成功");
            data.setData(account);
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
}
