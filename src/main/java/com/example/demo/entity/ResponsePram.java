package com.example.demo.entity;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.entity
 * @ClassName: ResponsePram
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/13 9:53
 * @Version: 1.0
 */
public class ResponsePram {

    private  String responseCode;
    private  String desc;
    public ResponsePram(){
        super();
    }

    public ResponsePram(String responseCode, String desc) {
        this.responseCode=responseCode;
        this.desc=desc;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode=responseCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc=desc;
    }

    @Override
    public String toString() {
        return "ResponsePram{" +
                "responseCode='" + responseCode + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
