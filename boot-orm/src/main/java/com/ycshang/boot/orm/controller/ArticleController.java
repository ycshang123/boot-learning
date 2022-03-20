package com.ycshang.boot.orm.controller;

import com.ycshang.boot.orm.entity.Article;
import com.ycshang.boot.orm.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-18 09:32
 **/
@RestController
@RequestMapping(value = "/api/v1/articles")
@AllArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping(value = "/all")
    public List<Article> selectAll() {
        return articleService.findAll();
    }

    @PostMapping()
    public Article addArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }
}