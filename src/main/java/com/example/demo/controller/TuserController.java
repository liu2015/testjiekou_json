package com.example.demo.controller;

import com.example.demo.Ulit.jsoncli;
import com.example.demo.entity.TUser;
import com.example.demo.service.TuserService;
import com.github.pagehelper.PageInfo;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.controller
 * @ClassName: TuserController
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 15:34
 * @Version: 1.0
 */
@Controller
public class TuserController {
    private final  static Logger logger=LoggerFactory.getLogger( TuserController.class );

    @Autowired
    TuserService tuserService;
    @RequestMapping("/list")
    public String findall(ModelMap map) {
        logger.info("logback 成功了");
        logger.error("logback 成功了");
        logger.debug("logback 成功了");

        /**
         * @Method findall 返回所有查询结果
         * @Author ZHY
         * @Version 1.0
         * @Description
         * @param map
         * @Return java.lang.String
         * @Exception
         * @Date 2019/10/31 20:16
         */
        List<TUser> all;
        all=tuserService.findall();
        map.addAttribute( "all", all );
        return "list";
    }

    @RequestMapping("/edit/{userId}")
    public String selectone(@PathVariable String userId, ModelMap map) {
        /**
         * @Method selectone 查询单个信息然后进行编辑
         * @Author ZHY
         * @Version 1.0
         * @Description
         * @param userId
         * @param map
         * @Return java.lang.String
         * @Exception
         * @Date 2019/10/31 21:32
         */
        logger.info("logback 成功了");
        logger.error("logback 成功了");
        logger.debug("logback 成功了");

        TUser tuser=new TUser();
        tuser.setUserId( userId );
        TUser selectone=tuserService.selectOne( tuser );
        map.addAttribute( "user", selectone );
        return "edit";
    }

    @RequestMapping("/del/{useId}")
    public String del(@PathVariable String useId) {
        /**
         * @Method del 删除指定的订单
         * @Author ZHY
         * @Version 1.0
         * @Description
         * @param userId
         * @Return java.lang.String
         * @Exception
         * @Date 2019/10/31 21:37
         */
        TUser del=new TUser();
        del.setUserId( useId );
        tuserService.del( del );
        return "redirect:/list";
    }

    @RequestMapping("toAdd")
    public String add() {
        return "add";
    }

    @RequestMapping("/addinsert")
    public String update (TUser user){
/**
 * @Method update 更新一条信息
 * @Author ZHY
 * @Version  1.0
 * @Description
 * @param user
 * @Return java.lang.String
 * @Exception
 * @Date 2019/10/31 21:49
 */
        tuserService.updateByPrimaryKey( user );
        return  "redirect:/list";
    }

    @RequestMapping("/search")
    public String searchall(){


        return "search";
    }
    @RequestMapping("post/{userId}")
    public String post(@PathVariable String userId ) {
        logger.info("logback-info 成功了");
        logger.error("logback-error 成功了");
        logger.debug("logback-debug 成功了");

        System.out.println( "执行接口推送post格式" );
        System.out.println( userId );
        // 调用推送方法
        jsoncli ddd=new jsoncli();
        try {
            Response dd=null;
            String ddw;
            ddw=ddd.run();
            System.out.println("是不是调用方法执行");
//            dd=ddd.run();
            System.out.println("是不是调用方法执行");
            System.out.println( "执行成功"+ddw );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/list";
    }

    @RequestMapping("/seachAll")
    public String searchall1(TUser user,ModelMap map) {
        List<TUser> user1=tuserService.seach( user.getUserName(), user.getPhone() );
//        List<TUser> user1=tuserServiceimpl.seach(user.getUserName(),user.getPassword() );
        map.addAttribute( "seachAll", user1 );
        return "search";
    }

    @RequestMapping("/inert")
    public String inert(TUser user12){
        tuserService.inert1(user12  );
        return "redirect:/list";
    }

    @RequestMapping("/listfy1")
    public String listfy(ModelMap map1, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){

        List<TUser> list=tuserService.getlist(pageNum,5);
        //格式化分页
        PageInfo<TUser> pageInfo=new PageInfo<TUser>(list);


        map1.addAttribute("pageInfo",pageInfo);
        return "listfy";
    }

}
