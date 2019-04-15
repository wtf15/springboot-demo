package com.example.demo.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wtf
 * @date 2019/4/12 17:47
 * @description: 定时任务实现类
 *  component注解 （把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //实现每过5秒输出一下当前时间
    //也可以写为@Scheduled(cron="*/5 * * * * *")
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
