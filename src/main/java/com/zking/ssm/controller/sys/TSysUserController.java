package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
@author yani
@create 2019-12-1215:49
*/
@RestController
@RequestMapping("/sysUser")
public class TSysUserController {
    @Resource
    private ISysUserService sysUserService;

    @RequestMapping(value="/list",method=RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public Object list(){

        DataProtocol data=new DataProtocol();
        List<TSysUser> myl=sysUserService.list();
        if(myl!=null){
            data.setCode(data.SUCCESS);
            data.setData(myl);
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
