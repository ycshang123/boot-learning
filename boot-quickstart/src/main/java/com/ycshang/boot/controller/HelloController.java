package com.ycshang.boot.controller;

import com.ycshang.boot.starter.service.Md5Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-07 14:55
 **/
@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @Resource
    private Md5Service md5Service;

    @GetMapping("/test")
    public String getMD5() {
        return "MD5加密结果为:" + md5Service.getMD5("hello-stater");
    }


}