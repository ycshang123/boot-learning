package com.ycshang.boot.event;

import com.ycshang.boot.Application;
import org.springframework.context.ApplicationEvent;

/**
 * @program: spring-boot-learning
 * @description: 自定义事件:继承ApplicationEvent抽象类，并定义自己的抽象方法
 * @author: ycshang
 * @create: 2022-04-04 15:06
 **/
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}