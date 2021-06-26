package com.easy.archiecture.job;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Component
public class JobService {

    @Scheduled(fixedRate = 5000)   //上一次开始执行时间点之后5秒再执行
//    @Scheduled(fixedDelay = 5000)    //上一次执行完毕时间点之后5秒再执行
//    @Scheduled(initialDelay=1000, fixedRate=5000)  //第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
//    @Scheduled(cron="*/5 * * * * *")   //通过cron表达式定义规则
    public void reportCurrentTime() {

        System.out.println("现在时间：" + LocalDate.now() + LocalTime.now());
    }
}
