package com.ycshang.boot.config.model;

import lombok.Data;

import java.util.List;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-14 11:06
 **/
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}