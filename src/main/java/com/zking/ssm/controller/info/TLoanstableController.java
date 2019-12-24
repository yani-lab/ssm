package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TLoanstable;
import com.zking.ssm.service.info.ILoanstableService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
@author yani
@create 2019-12-1215:55
*/
@RestController
@RequestMapping("/loastable")
public class TLoanstableController {
    @Resource
    private ILoanstableService loanstableService;
    @RequestMapping("/listloanst")
    public Object listloanst(@RequestBody TLoanstable loanstable){
        System.out.println(loanstable.toString());
        DataProtocol data=new DataProtocol();
        List<TLoanstable> myl=loanstableService.listloanst(loanstable);
        if(myl!=null){
            data.setCode(1);
            data.setMessage("操作成功");
            data.setData(myl);
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }

        return data;
    }
}
