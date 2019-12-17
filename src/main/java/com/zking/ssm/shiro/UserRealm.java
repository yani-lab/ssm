package com.zking.ssm.shiro;

import com.zking.ssm.model.sys.TSysUser;
import com.zking.ssm.service.sys.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

public class UserRealm extends AuthorizingRealm {
    @Resource
    private ISysUserService userService;

    /**
     * 授权的方法
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证的方法
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username=token.getPrincipal().toString();
        TSysUser user=userService.login(username);

        //如果用户不存在
        if(user == null){
            //那么就抛出这个异常
            throw new UnknownAccountException("未知的账户");
        }

        //暂时不考虑加密
        /**
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                this.getName()
        );*
         */
        System.out.println(user.toString());
        //考虑加密
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUserName(),
                user.getUserPwd(),
                //加密盐
                ByteSource.Util.bytes(user.getSalt()),
                this.getName()
        );

        return authenticationInfo;
    }
}
