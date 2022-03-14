package com.ycshang.boot.config.model;

import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;


/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-14 14:13
 **/
@Data
public class Book {
    //@NotNull
    private String bookName;
    //@NotNull
    private Integer price;
    //@Past
    private Date time;
}