package com.zking.ssm.controller.info;
/*
@author yani
@create 2019-12-1216:02
*/

import com.zking.ssm.model.info.TProducttable;
import com.zking.ssm.service.info.IProducttableService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
}
