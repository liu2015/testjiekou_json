package com.example.demo.controller;

import com.example.demo.entity.SysUser;
import com.example.demo.service.SysuserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.controller
 * @ClassName: loginController
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 15:20
 * @Version: 1.0
 */
@Controller
public class loginController {

    @Autowired
    SysuserService sysuserService;

    @RequestMapping("/")
    public String index(){

        return "login";
    }

    @RequestMapping("login")
    public String index1(){

        return "login";
    }
    @RequestMapping("/tologin")
    public String selectOne(SysUser user, ModelMap map){
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken( user.getLoginName(),user.getPassword() );

        try{
            subject.login( token );
            return "redirect:/list";
        }catch (UnknownAccountException e)
        {
            map.addAttribute( "msg","用户名字体不存在" );
            return "/login";
        }catch (IncorrectCredentialsException e)
        {
            map.addAttribute( "msg","密码错误" );
            return "/login";
        }
    }



}
