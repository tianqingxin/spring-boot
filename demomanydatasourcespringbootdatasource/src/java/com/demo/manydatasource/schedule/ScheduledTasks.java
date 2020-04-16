package com.demo.manydatasource.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 集成任务调度
 * @create: 2020-03-31 13:32
 **/
@Component
public class ScheduledTasks {
    /**
     * 5秒执行一次
     */
    @Scheduled(fixedRate = 5000)
    public void getTime(){
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间："+df.format(new Date()));
    }
}
