package com.ycshang.boot;

import com.ycshang.boot.event.MyEvent;
import com.ycshang.boot.listener.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 10:18
 **/
@SpringBootApplication
@ServletComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        //ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        ////装载监听
        //context.addApplicationListener(new MyListener1());
        //context.publishEvent(new MyEvent("测试事件"));
    }
}