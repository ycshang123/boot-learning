package com.ycshang.boot.jpa.controller;


import com.ycshang.boot.jpa.common.AjaxResponse;
import com.ycshang.boot.jpa.entity.Article;
import com.ycshang.boot.jpa.service.impl.ArticleJpaServiceImpl;
import lombok.Builder;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description: ArticleJpaController
 * @author: ycshang
 * @date: 2022/3/18
 **/

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/articles")
public class ArticleJpaController {
    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    @GetMapping(value = "/all")
    public AjaxResponse selectAll() {
        return AjaxResponse.success(articleJpaService.selectAll());
    }

    @PostMapping()
    public AjaxResponse addArticle(@RequestBody Article article) {
        return AjaxResponse.success(articleJpaService.saveArticle(article));
    }

    @PutMapping()
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (articleJpaService.saveArticle(article) != null) {
            return AjaxResponse.success("修改成功");
        } else {
            return AjaxResponse.failure();
        }
    }

    @GetMapping("{id}")
    public AjaxResponse findById(@PathVariable int id) {
        return AjaxResponse.success(articleJpaService.findById(id));
    }


    @GetMapping("/articleNoQuery")
    public Page<Article> findArticleNoCriteria(@RequestParam Integer page, @RequestParam Integer size) {
        Page<Article> articles = articleJpaService.findArticleNotCriteria(page, size);
        return articles;
    }

    @GetMapping("/articleQuery")
    public Page<Article> findArticleCriteria(@RequestParam Integer page, @RequestParam Integer size,String title) {
        Article article = Article.builder().title(title).build();
        Page<Article> articles = articleJpaService.findArticleCriteria(page, size,article);
        return articles;
    }
}
