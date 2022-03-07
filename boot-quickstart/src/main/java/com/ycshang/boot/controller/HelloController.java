package com.ycshang.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-07 14:55
 **/
@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping(value = "/hello")
    public String getHello() {
        return "hello world";
    }
}