package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysTemdictionary;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;
import com.zking.ssm.service.sys.ISysTemdictionaryService;
import com.zking.ssm.service.sys.ISysTemdictionaryitemService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
@author yani
@create 2019-12-1215:49
*/
@RestController
@RequestMapping("/temdictionaryitem")
public class TSysTemdictionaryitemController {
    @Resource
    private ISysTemdictionaryitemService sysTemdictionaryitemService;
    @Resource
    private ISysTemdictionaryService sysTemdictionaryService;
    @RequestMapping("/listtemdic")
    public Object listtemdic(@RequestBody  TSysTemdictionaryitem tSysTemdictionaryitem){
        DataProtocol data=new DataProtocol();
        List<TSysTemdictionaryitem> temdict=sysTemdictionaryitemService.listtemd(tSysTemdictionaryitem);
        if(temdict!=null){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(temdict);
            return data;
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }
    }
    @RequestMapping("/gettemdict")
    public Object gettemdict(@RequestBody  TSysTemdictionaryitem tSysTemdictionaryitem){
        DataProtocol data=new DataProtocol();
        List<TSysTemdictionaryitem> temdict=sysTemdictionaryitemService.listtemdict(tSysTemdictionaryitem);
        if(temdict!=null){
            for(TSysTemdictionaryitem t:temdict){
                TSysTemdictionary dict=new TSysTemdictionary();
                dict.setSysdId(t.getParentId());
                TSysTemdictionary tt=sysTemdictionaryService.getById(dict);
                t.setParentName(tt.getTitle());
            }
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(temdict);
            return data;
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }
    }
    @RequestMapping("/addtemdict")
    public Object addtemdict(@RequestBody  TSysTemdictionaryitem tSysTemdictionaryitem){
        DataProtocol data=new DataProtocol();
        int n=sysTemdictionaryitemService.addtemdict(tSysTemdictionaryitem);
        if(n>0){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            return data;
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }
    }
    @RequestMapping("/updatetemdict")
    public Object updateemdict(@RequestBody  TSysTemdictionaryitem tSysTemdictionaryitem){
        DataProtocol data=new DataProtocol();
        int n=sysTemdictionaryitemService.updatetemdict(tSysTemdictionaryitem);
        if(n>0){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            return data;
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }
    }
    @RequestMapping("/deltemdict")
    public Object deltemdict(@RequestBody  TSysTemdictionaryitem tSysTemdictionaryitem){
        DataProtocol data=new DataProtocol();
        int n=sysTemdictionaryitemService.deltemdict(tSysTemdictionaryitem);
        if(n>0){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            return data;
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }
    }
}
