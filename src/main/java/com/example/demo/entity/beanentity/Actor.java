package com.example.demo.entity.beanentity;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.entity.beanentity
 * @ClassName: Actor
 * @Author: os
 * @Description: 实体
 * @Date: 15/11/19 下午8:43
 * @Version: 1.0
 */

public class Actor {

    private String name;
    private List<Map> fans;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map> getFans() {
        return fans;
    }

    public void setFans(List<Map> fans) {
        this.fans = fans;
    }
}
