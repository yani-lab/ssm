package com.zking.ssm.controller.info;
/*
@author yani
@create 2019-12-1216:02
*/

import com.zking.ssm.model.info.TProducttable;
import com.zking.ssm.service.info.IProducttableService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/producttable")
public class TProducttableController {
    @Resource
    private IProducttableService producttableService;
    @RequestMapping("/list")
    public Object listprod(){
        DataProtocol data=new DataProtocol();
        List<TProducttable> myl=producttableService.listprod();
        if(myl!=null){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(myl);
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
        }

        return data;
    }
    @RequestMapping("/listname")
    public Object listname(@RequestBody TProducttable producttable){
        DataProtocol data=new DataProtocol();
        List<TProducttable> pro=producttableService.listprodname(producttable);
        if(pro!=null){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(pro);
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
        }

        return data;
    }
    @RequestMapping("/addpro")
    public Object addpro(@RequestBody TProducttable producttable){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        producttable.setTime(df.format(new Date()));
        producttable.setRequire(df.format(new Date()));
        DataProtocol data=new DataProtocol();
        int n=producttableService.addpro(producttable);
        if(n>0){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
        }
        return data;
    }
    @RequestMapping("/updatepro")
    public Object updatepro(@RequestBody TProducttable producttable){
        System.out.println(producttable.toString());
        DataProtocol data=new DataProtocol();
        int n=producttableService.updatepro(producttable);
        if(n>0){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
        }
        return data;
    }
    @RequestMapping("/delpro")
    public Object delpro(@RequestBody TProducttable producttable){
        DataProtocol data=new DataProtocol();
        int n=producttableService.delpro(producttable);
        if(n>0){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
        }
        return data;
    }
}
