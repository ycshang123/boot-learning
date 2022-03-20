package com.ycshang.boot.orm.service;

import com.ycshang.boot.orm.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;


    @Test
    public void saveArticle(){
        Article article = Article.builder()
                .author("ycshang")
                .title("service新增")
                .content("从入门到精通")
                .createTime(new Date())
                .build();
        Article saveArticle = articleService.saveArticle(article);
        assertNotNull(saveArticle);
    }

}