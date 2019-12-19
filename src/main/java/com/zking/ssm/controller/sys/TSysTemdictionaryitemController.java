package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysTemdictionaryitem;
import com.zking.ssm.service.sys.ISysTemdictionaryitemService;
import com.zking.ssm.util.DataProtocol;
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
    @RequestMapping("/listtemdic")
    public Object listtemdic(TSysTemdictionaryitem tSysTemdictionaryitem){
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
}
