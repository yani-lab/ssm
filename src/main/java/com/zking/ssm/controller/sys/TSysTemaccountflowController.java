package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysTemaccountflow;
import com.zking.ssm.service.sys.ISysTemaccountflowService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
@author yani
@create 2019-12-1215:48
*/
@RestController
@RequestMapping("/accountflow")
public class TSysTemaccountflowController {
    @Resource
    private ISysTemaccountflowService sysTemaccountflowService;
    @RequestMapping("/listacc")
    public Object listacc(@RequestBody TSysTemaccountflow sysTemaccountflow){
        DataProtocol data=new DataProtocol();
        List<TSysTemaccountflow> myl=sysTemaccountflowService.listflow(sysTemaccountflow);
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
