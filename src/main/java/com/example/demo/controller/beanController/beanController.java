package com.example.demo.controller.beanController;

import com.example.demo.entity.beanentity.Actor;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller.beanController
 * @ClassName: beanController
 * @Author: os
 * @Description: bean转换json
 * @Date: 15/11/19 下午8:44
 * @Version: 1.0
 */
@Controller
public class beanController {



    public String bean(){
    Actor actor=new Actor();

    actor.setName("object");
    //生成第一个泛型参数
        Map<String ,Object> map1=new HashMap<String, Object>();
        map1.put("name","小王");
        map1.put("age","8");

        //生成第二个泛型参数
        Map<String,Object> map2=new HashMap<String, Object>();
        map2.put("name","王尼玛");
        map2.put("age","10");

        //生成一个列表属性值,来存储对象类型

        List<Map> maps=new ArrayList<Map>();
        maps.add(map1);
        maps.add(map2);
        //放置进入实体类对象里
        actor.setFans(maps);
        System.out.println("java bean 对象json  " +new Gson().toJson(actor));
        return new Gson().toJson(actor);

}
@Test
public void run1(){

  String dd=  this.bean();

    this.beanParse(dd);


}


// json复杂的解析 用的是gson

    public void beanParse(String jsonString){

        System.out.println("开始解析");

        JsonObject object=new JsonParser().parse(jsonString).getAsJsonObject();
        Actor actor=new Gson().fromJson(object,Actor.class);
        System.out.println("姓名");
        System.out.println(""+actor.getName());
        System.out.println(""+object.get("name"));
        System.out.println("fans");
        for (Map map:actor.getFans())
        {
            System.out.println("姓名 "+map.get("name")+"年龄"+map.get("age"));
        }


    }





}
