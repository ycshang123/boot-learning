package com.ycshang.embed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-08 09:17
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloTest(){
        return "Hello";
    }
}