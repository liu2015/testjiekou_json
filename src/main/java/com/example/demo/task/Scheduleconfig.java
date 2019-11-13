package com.example.demo.task;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.task
 * @ClassName: Scheduleconfig
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 16:48
 * @Version: 1.0
 */
//@Configurable
//    @Component
@Configuration
@EnableScheduling
public class Scheduleconfig implements SchedulingConfigurer, AsyncConfigurer {


    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        //执行定时配置
        taskRegistrar.setTaskScheduler( taskScheduler() );
    }

    public TaskScheduler taskScheduler(){

        ThreadPoolTaskScheduler taskScheduler=new ThreadPoolTaskScheduler();
        //初始化话进程
        taskScheduler.initialize();
        taskScheduler.setPoolSize(4); //配置线程进程
        taskScheduler.setThreadNamePrefix("spring-task-scheduler-thread-");
        taskScheduler.setAwaitTerminationSeconds(60); //线程池关闭最大等待时间
        taskScheduler.setWaitForTasksToCompleteOnShutdown(true); //线程关闭等待任务完成
        taskScheduler.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy()); //任务丢弃策略


        return taskScheduler;


    }

}
