package com.ycshang.boot.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-11 11:10
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Article {
    @Min(6)
    private Integer id;
    @NotNull(message = "文章标题不能为空")
    private String title;
}