package com.ycshang.boot.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: ycshang
 * @create: 2022-03-13 13:07
 **/
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping("world")
    public String getHelloWorld() {
        return "hello world";
    }
}
