package com.example.demo.controller.jsonController;

import com.example.demo.Ulit.jsoncli;
import com.example.demo.entity.TUser;
import com.example.demo.service.TuserService;
import com.google.gson.Gson;
import org.apache.ibatis.annotations.SelectProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.io.IOException;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.controller.jsonController
 * @ClassName: jsonController
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 16:39
 * @Version: 1.0
 */
@Controller
public class jsonController {

    private final static Logger logger=LoggerFactory.getLogger( jsonController.class );


    @Autowired
    TuserService tuserService;

    @RequestMapping("/postone/{userId}")
    @SelectProvider(type = BaseSelectProvider.class, method = "dynamicSQL")
    public String selectOne(@PathVariable String userId) throws IOException {
        TUser dd1= new TUser();
        dd1.setUserId(userId);

        TUser d= tuserService.selectOne(dd1);
        Gson gson=new Gson();
        String dd= gson.toJson(d);
        jsoncli json=new jsoncli();
        String ww=json.run1(dd);
        logger.info("执行数据库的转换json"+dd);
        logger.info("执行输出"+ww);
        return "redirect:/list";
    }

}
