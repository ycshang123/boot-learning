package com.ycshang.boot.orm.dao;


import com.ycshang.boot.orm.entity.Article;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: ycshang
 * @create: 2022-03-18 08:44
 **/
@Repository
public class ArticleDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 新增文章
     * @param article 入参
     */
    public int save(Article article) {
        String sql = "INSERT INTO article (id,author,title,content,create_time) VALUES (?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                article.getId(),
                article.getAuthor(),
                article.getTitle(),
                article.getContent(),
                article.getCreateTime());
    }

    public int deleteById(Integer id) {
        return jdbcTemplate.update("DELETE FROM article WHERE id = ?",id);
    }

    public int updateById(Article article) {
        String sql = "UPDATE article SET author = ?,title =  ?,content = ?,create_time = ? WHERE id = ?";
        return jdbcTemplate.update(sql,
                article.getAuthor(),
                article.getTitle(),
                article.getContent(),
                article.getCreateTime(),article.getId());
    }

    public Article findById(Integer id) {
        String sql = "SELECT * FROM article WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Article.class),new Object[]{id});
    }

    public List<Article> findAll() {
        String sql = "SELECT * FROM article";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Article.class));
    }
}
