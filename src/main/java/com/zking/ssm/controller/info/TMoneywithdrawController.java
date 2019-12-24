package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TMoneywithdraw;
import com.zking.ssm.service.info.IMoneywithdrawService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
@author yani
@create 2019-12-1215:58
*/
@RestController
@RequestMapping("/MoneywithDraw")
public class TMoneywithdrawController {
    @Resource
    private IMoneywithdrawService moneywithdrawService;
    @RequestMapping("/DrawMoney")
    public Object DrawMoney(TMoneywithdraw moneywithdraw){
        DataProtocol data = new DataProtocol();
       int m= moneywithdrawService.addDrawMoney(moneywithdraw);
        if(m>=1){
            data.setCode(DataProtocol.SUCCESS);
            data.setMessage("操作成功");
        }else{
            data.setCode(DataProtocol.FAIL);
            data.setMessage("操作失败");
        }
        data.setData(m);
        return data;
    }
}
