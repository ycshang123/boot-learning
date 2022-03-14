package com.ycshang.boot.config.service;

import lombok.Data;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-14 14:46
 **/
@Data
public class TestBeanService1 {
    private String name;

    public TestBeanService1(String name) {
        this.name = name;
    }
}