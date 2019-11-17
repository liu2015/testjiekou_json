package com.example.demo.Ulit;

import java.text.SimpleDateFormat;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.Ulit
 * @ClassName: SimpleDate
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/17 16:52
 * @Version: 1.0
 */
public class SimpleDate {

    public String  run(String args){

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat( "yyyy-MM-dd HH-mm-ss" );

        String daterun=simpleDateFormat.format( args );
        return daterun;

    }
}
