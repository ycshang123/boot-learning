package com.ycshang.boot.template.controller;

import com.ycshang.boot.template.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 09:10
 **/
@Controller
@RequestMapping("/template")
public class TemplateController {


    @GetMapping("/freemarker")
    public String freeMarkerIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java从入门精通"),
                new Article(2, "张三丰", "Spring"),
                new Article(3, "张三风", "SpringBoot")
        );
        model.addAttribute("articles", articles);
        System.out.println(articles);
        //    模板名称
        return "freemarker-demo";
    }


    @GetMapping("/thymeleaf")
    public String thymeleafIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java从入门精通"),
                new Article(2, "张三丰", "Spring"),
                new Article(3, "张三风", "SpringBoot")
        );
        model.addAttribute("articles", articles);
        System.out.println(articles);
        //    模板名称
        return "thymeleaf-demo";

    }
}