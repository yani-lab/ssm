package com.zking.ssm.controller.sys;

import com.zking.ssm.model.info.TAccount;
import com.zking.ssm.model.info.TUserinfo;
import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.info.IAccountService;
import com.zking.ssm.service.info.IUserinfoService;
import com.zking.ssm.service.sys.ISysUserService;
import com.zking.ssm.util.DataProtocol;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/*
@author yani
@create 2019-12-1215:49
*/
@RestController
@RequestMapping("/user")
public class TSysUserController {
    @Resource
    private ISysUserService sysUserService;
    @Resource
    private IAccountService accountService;
    @Resource
    private IUserinfoService userinfoService;
    @RequestMapping("/register")
    public Object  regiestUser(TSysUser sysUser){
        DataProtocol obj = new DataProtocol();
        int u=sysUserService.RegisterUser(sysUser);
       if(u>=1){
           obj.setCode(DataProtocol.SUCCESS);
           obj.setMessage("注册成功");
       }else{           obj.setCode(DataProtocol.FAIL);
           obj.setMessage("注册失败");
       }
        return obj;
    }
@RequestMapping("/login")
    public Object login(@RequestBody TSysUser user){
    System.out.println(user.toString());
        DataProtocol data = new DataProtocol();
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(),user.getUserPwd());
        try {
            TSysUser u=sysUserService.login(user.getUserName());
            //如果role是1，那么说明是从前台登录的，那么只能是普通用户
            if(user.getRole()==1){
                //这里需要判断登录的用户角色是否是普通用户
                if(u.getRole()==1){
                        TAccount a=new TAccount();
                        a.setUserId(u.getUserId());
                        TUserinfo info=new TUserinfo();
                        info.setUserId(u.getUserId());
                        TUserinfo userinfo=userinfoService.listuserinfo(info);
                        TAccount account=accountService.listaccount(a);
                        Map<String,Object> map=new HashMap<>();
                        map.put("user",u);
                        map.put("userinfo",userinfo);
                        map.put("account",account);
                        subject.login(token);
                        data.setData(map);
                        data.setCode(DataProtocol.SUCCESS);
                        data.setMessage("登录成功");
                    }
                else{
                    data.setCode(DataProtocol.FAIL);
                    data.setMessage("登录失败");
                }
            }else{
                System.out.println(u.toString());
                //如果不是1，那么说明是从后台登录，那么就是系统管理人员
                if(u.getRole()!=1){
                    //这里需要判断role不等于1，如果等于1就是普通用户，没有登录后台的资格
                    data.setData(u);
                    data.setCode(DataProtocol.SUCCESS);
                    data.setMessage("登录成功");
                }
                else{
                    data.setCode(DataProtocol.FAIL);
                    data.setMessage("登录失败");
                }
            }

        }catch (AuthenticationException ex){
            data.setCode(DataProtocol.FAIL);
            data.setMessage("登录失败");
        }
        return data;

    }
}
