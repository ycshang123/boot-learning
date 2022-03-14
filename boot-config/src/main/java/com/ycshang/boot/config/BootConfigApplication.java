package com.ycshang.boot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-14 10:59
 **/
@Slf4j
@SpringBootApplication
@ImportResource(locations = {"classpath:bean.xml","classpath:beans.xml"})
public class BootConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootConfigApplication.class, args);
        log.info("服务启动成功");
    }

}