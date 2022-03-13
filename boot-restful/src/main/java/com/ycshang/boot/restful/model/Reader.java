package com.ycshang.boot.restful.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-10 19:03
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reader {
    private String name;
    private Integer age;
}