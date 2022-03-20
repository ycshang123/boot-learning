package com.ycshang.boot.orm.dao;

import com.ycshang.boot.orm.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleDaoTest {
    @Resource
    private ArticleDao articleDao;

    @Test
    void save() {
        Article article = Article.builder()
                .author("ycshang")
                .title("测试")
                .content("从入门到精通")
                .createTime(new Date())
                .build();
        int rows = articleDao.save(article);
        assertEquals(1,rows);
    }



    @Test
    void updateById() {
        Article article = Article.builder()
                .author("ycshang")
                .title("SpringBoot")
                .content("修改")
                .createTime(new Date())
                .build();
        int rows = articleDao.updateById(article);
        assertEquals(1,rows);

    }



    @Test
    void findAll() {
        List<Article> list = articleDao.findAll();
        assertEquals(2,list.size());
    }
}