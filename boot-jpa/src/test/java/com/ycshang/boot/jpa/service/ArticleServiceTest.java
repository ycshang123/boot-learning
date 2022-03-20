package com.ycshang.boot.jpa.service;

import com.ycshang.boot.jpa.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;


    @Test
    public void saveArticle() {
        Article article = Article.builder()
                .author("ycshang")
                .title("service新增")
                .content("从入门到精通")
                .thumbnail("https://public-cdn-oss.mosoteach.cn/mssvc/cover/2022/03/e5b83c72f5c018245be7a63b553e50ce.png?x-oss-process=style/s200x200")
                .updateTime(new Date())
                .createTime(new Date())
                .build();
        Article saveArticle = articleService.saveArticle(article);
        assertNotNull(saveArticle);
    }


    @Test
    public void deleteById() {
        articleService.deleteById(1);
    }

    @Test
    public void findById() {
        Article article = articleService.findById(3);
        System.out.println(article.toString());
    }


    @Test
    public void findByAuthor() {
        List<Article> list = articleService.findByAuthor("ycshang");
        list.forEach(System.out::println);
    }

    @Test
    public void selectAll() {
        List<Article> list = articleService.selectAll();
        list.forEach(System.out::println);
    }

}