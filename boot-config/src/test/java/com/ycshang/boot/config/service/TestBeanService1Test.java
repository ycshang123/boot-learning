package com.ycshang.boot.config.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanServiceTest1 {
    //    注入Spring上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
        //    从测试环境Spring上下文中去读取xml配置文件，得到testBeanService
        //boolean flag = ioc.containsBean("testBeanService");
        TestBeanService testBeanService = (TestBeanService) ioc.getBean("testBeanService");
        log.info(testBeanService.getName());

    }

}