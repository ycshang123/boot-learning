package com.ycshang.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 16:17
 **/
@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("ApplicationRunner参数名称:{}",args.getOptionNames());
        log.info("ApplicationRunner-->username的参数值:{}",args.getOptionValues("username"));
        log.info("ApplicationRunner参数:{}", Arrays.toString(args.getSourceArgs()));
    }
}