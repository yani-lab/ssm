package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.model.sys.TSysUserRole;
import com.zking.ssm.service.sys.ISysUserRoleService;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
@author yani
@create 2019-12-1215:50
*/
@RestController
@RequestMapping("/userRole")
public class TSysUserRoleController {
    @Resource
    private ISysUserRoleService sysUserRoleService;
    @Resource
    private ISysUserService sysUserService;
    @RequestMapping("/listrole")
    public Object listrole(@RequestBody  TSysUserRole sysUserRole){
        DataProtocol data=new DataProtocol();
        List<TSysUserRole> userrole = sysUserRoleService.listByRoleId(sysUserRole);
        if(userrole!=null){
            for (TSysUserRole r:userrole){
                TSysUser user=new TSysUser();
                user.setUserId(r.getUserId());
                TSysUser u=sysUserService.getById(user);
                r.setUserName(u.getUserName());
            }
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(userrole);
        }
        else{
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
        }
        return data;
    }
}
