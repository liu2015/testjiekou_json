package com.example.demo.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.shiro
 * @ClassName: ShiroConfig
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 14:57
 * @Version: 1.0
 */
@Configuration
public class ShiroConfig {

    @Bean(name="shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager)
    {
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager( defaultWebSecurityManager );
        Map<String,String> fMap=new HashMap<String, String>(  );
        fMap.put( "/list","authc" );

        shiroFilterFactoryBean.setLoginUrl( "/login" );
        shiroFilterFactoryBean.setUnauthorizedUrl( "/permission" );
        shiroFilterFactoryBean.setFilterChainDefinitionMap( fMap );

        return shiroFilterFactoryBean;
    }
    @Bean(name="defaultWebSecurityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager(  );
        defaultWebSecurityManager.setRealm( userRealm );
        return defaultWebSecurityManager;

    }


    @Bean(name="userRealm")
    public UserRealm getRealm(){

        return new UserRealm();
    }
}
