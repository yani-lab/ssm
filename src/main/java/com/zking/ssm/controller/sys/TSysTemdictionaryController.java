package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysTemdictionary;
import com.zking.ssm.service.sys.ISysTemdictionaryService;
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
@RequestMapping("/SysTemdictionary")
public class TSysTemdictionaryController {
    @Resource
    private ISysTemdictionaryService sysTemdictionaryService;
    @RequestMapping("/listdict")
    public Object listdict(@RequestBody TSysTemdictionary sysTemdictionary){
        DataProtocol data=new DataProtocol();
        List<TSysTemdictionary> myl=sysTemdictionaryService.listtemdict(sysTemdictionary);
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
    @RequestMapping("/adddict")
    public Object adddict(@RequestBody TSysTemdictionary sysTemdictionary){
        DataProtocol data=new DataProtocol();
        sysTemdictionary.setSn(sysTemdictionary.getSysdId()+"");
        int n=sysTemdictionaryService.addtemdict(sysTemdictionary);
        if(n>0){
            data.setCode(1);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
    @RequestMapping("/updatedict")
    public Object updatedict(@RequestBody TSysTemdictionary sysTemdictionary){
        DataProtocol data=new DataProtocol();
        int n=sysTemdictionaryService.updatetemdict(sysTemdictionary);
        if(n>0){
            data.setCode(1);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
    @RequestMapping("/deldict")
    public Object deldict(@RequestBody TSysTemdictionary sysTemdictionary){
        DataProtocol data=new DataProtocol();
        int n=sysTemdictionaryService.deltemdict(sysTemdictionary);
        if(n>0){
            data.setCode(1);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(-1);
            data.setMessage("操作失败");
        }
        return data;
    }
}
