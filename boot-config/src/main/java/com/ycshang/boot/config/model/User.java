package com.ycshang.boot.config.model;

import com.ycshang.boot.config.util.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-14 14:14
 **/
@Data
@Component
@ConfigurationProperties(prefix = "user")
@Validated
@PropertySource(value = {"classpath:user.yml"}, factory = MixPropertySourceFactory.class)
public class User {
    private String name;
    private Integer age;
    @Valid
    private Book book;
}