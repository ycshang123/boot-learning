package com.ycshang.boot.exception.controller;

import com.ycshang.boot.exception.entity.Article;
import com.ycshang.boot.exception.service.ArticleService;
import com.ycshang.boot.exception.utils.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-11 11:44
 **/
@RestController
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @GetMapping("/test/{id}")
    public AjaxResponse test(@PathVariable("id") int id) {
        if(id ==0){
            articleService.systemBizError(id);
        }
        articleService.userBizError(id);
        Article article = Article.builder()
                .id(10)
                .title("Java从入门到精通")
                .build();
        return AjaxResponse.success(article);
    }



    @PostMapping("/articles")
    public Article saveArticle(@Valid @RequestBody Article article) {
        return article;
    }


}