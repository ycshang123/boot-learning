package com.ycshang.boot.config.service;

import lombok.Data;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-14 14:46
 **/
@Data
public class TestBeanService {
    private String name;

    public TestBeanService(String name) {
        this.name = name;
    }

    public TestBeanService() {

    }
}