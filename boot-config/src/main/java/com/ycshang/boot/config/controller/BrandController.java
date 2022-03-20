package com.ycshang.boot.config.controller;

import com.ycshang.boot.config.mapper.BrandMapper;
import com.ycshang.boot.config.model.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-15 23:26
 **/
@RestController
@RequestMapping(value = "/api")
public class BrandController {
    @Resource
    private BrandMapper brandMapper;

    @GetMapping("/list")
    public List<Brand> getBrandList() {
        System.out.println("请求");
        return brandMapper.selectAll();
    }

    @GetMapping("/test")
    public void test() {
        System.out.println("请求");
    }

}