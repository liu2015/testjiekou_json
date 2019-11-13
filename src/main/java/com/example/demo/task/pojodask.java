package com.example.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.task
 * @ClassName: pojodask
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 16:48
 * @Version: 1.0
 */

@Component
public class pojodask {

    private static final Logger logger=LoggerFactory.getLogger( pojodask.class );

    @Scheduled(fixedRate = 1000)
    public void prjo_dask(){
        Date dd=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String ddw=simpleDateFormat.format(dd);
        logger.info("现在时间:"+ddw);
        System.out.println("执行定时");
    }
    @Scheduled(fixedRate = 1000)
    public void prjo_dask1(){
        Date dd=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String ddw=simpleDateFormat.format(dd);
        logger.info("现在时间111:"+ddw);
        System.out.println("执行定时222");
    }

}
