package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TLoanstable;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;
import com.zking.ssm.service.info.ILoanstableService;
import com.zking.ssm.service.sys.ISysTemdictionaryitemService;
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
    @Resource
    private ISysTemdictionaryitemService sysTemdictionaryitemService;
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
    @RequestMapping("/listloan")
    public Object listloan(@RequestBody TLoanstable loanstable){
        System.out.println(loanstable.toString());
        DataProtocol data=new DataProtocol();
        List<TLoanstable> loan=loanstableService.listloan(loanstable);
        if(loan!=null){
            for(TLoanstable a:loan){
                TSysTemdictionaryitem item=new TSysTemdictionaryitem();
                //还款方式
                item.setSysfiId(Integer.parseInt(a.getRepayment()));
                TSysTemdictionaryitem t = sysTemdictionaryitemService.selectTitle(item);
                a.setRepayName(t.getTitle());
                item.setSysfiId(Integer.parseInt(a.getStagetypeId()));
                TSysTemdictionaryitem t1 = sysTemdictionaryitemService.selectTitle(item);
                a.setStagetypeName(t1.getTitle());
            }
            data.setData(loan);
            data.setCode(1);
        }
        else{
            data.setCode(-1);
        }
        return data;
    }
}
