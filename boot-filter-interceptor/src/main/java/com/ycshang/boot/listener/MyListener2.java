package com.ycshang.boot.listener;

import com.ycshang.boot.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 15:09
 **/
@Component
@Slf4j
public class MyListener2 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s监听到事件源:%s.", MyListener2.class.getName(),event.getSource()));
    }
}