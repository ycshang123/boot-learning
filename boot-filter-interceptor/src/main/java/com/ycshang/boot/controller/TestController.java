package com.ycshang.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 10:30
 **/
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpSession session) {
        //    操作request的attribute
        request.setAttribute("a", "a");
        request.setAttribute("a", "b");
        request.getAttribute("a");
        request.removeAttribute("a");
        //    操作session
        session.setAttribute("a", "a");
        session.getAttribute("a");
        session.invalidate();
        return "hello world ----";
    }


    @PostMapping("/calculate")
    public Integer calculate(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 / num2;
    }
}