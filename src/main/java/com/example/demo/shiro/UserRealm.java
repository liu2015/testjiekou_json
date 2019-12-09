package com.example.demo.shiro;

import com.example.demo.entity.SysUser;
import com.example.demo.service.SysuserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.shiro
 * @ClassName: UserRealm
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 14:27
 * @Version: 1.0
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    SysuserService sysuserService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        System.out.println( "执行授权" );
        Subject subject=SecurityUtils.getSubject();
        SysUser user=(SysUser) subject.getPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo(  );
        simpleAuthorizationInfo.addStringPermission( user.getLoginName() );
        return simpleAuthorizationInfo;

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken args) throws AuthenticationException {
        System.out.println( "认证,登录验证合法性" );
        UsernamePasswordToken token=(UsernamePasswordToken) args;
        SysUser sysUser=new SysUser();
        sysUser.setLoginName( token.getUsername() );
        sysUser.setPassword( String.copyValueOf( token.getPassword() ) );

        SysUser newUser=sysuserService.selectOne( sysUser );

        if (newUser==null)
        {
            return null;
        }
        return new SimpleAuthenticationInfo( newUser,newUser.getPassword(),"" );
    }
}
