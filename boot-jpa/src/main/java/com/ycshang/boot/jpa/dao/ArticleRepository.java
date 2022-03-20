package com.ycshang.boot.jpa.dao;


import com.ycshang.boot.jpa.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @description:
 * @author: ycshang
 * @date: 2022/3/18
 **/
public interface ArticleRepository extends JpaRepository<Article, Integer> , JpaSpecificationExecutor<Article> {

    /**
     * 注意这个方法的名称，JPA会根据方法名自动生成SQL执行
     * 等同于：SELECT * FROM article WHERE author =?
     *
     * @param author author
     * @return List<Article>
     */
    List<Article> findByAuthor(String author);

}
