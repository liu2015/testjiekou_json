package com.example.demo.controller.jsonController;

import com.example.demo.entity.ResponsePram;
import com.example.demo.service.TuserService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.controller.jsonController
 * @ClassName: jsonservice
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/13 9:47
 * @Version: 1.0
 */
@Controller("/jsons-service")
public class jsonservice {

    private final static Logger logger =LoggerFactory.getLogger( jsonservice.class );

    @RequestMapping(value="v2",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public String erpRequest(@RequestBody String parms)
    {
        logger.info( "开始接受请求"+parms );
        Map<String, ResponsePram> map=new HashMap<String, ResponsePram>(  );
        ResponsePram rp=new ResponsePram( "100","测试成功" );
        map.put( "Response",rp );
        Gson gson=new Gson();

        String json=gson.toJson( map );

        logger.info( "准备返回接口内容"+json );
        return json;
    }
}
