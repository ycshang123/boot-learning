package com.ycshang.boot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 11:41
 **/
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    @Resource
    private CustomHandlerInterceptor customHandlerInterceptor;
    @Resource
    private AccessLogInterceptor accessLogInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器 拦截规则
        //registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
        registry.addInterceptor(accessLogInterceptor).addPathPatterns("/*");
    }
}