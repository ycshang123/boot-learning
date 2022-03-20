package com.ycshang.boot.orm.service;

import com.ycshang.boot.orm.entity.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ycshang
 */
public interface ArticleService {

    /**
     * 新增
     * @param article
     * @return
     */
    Article saveArticle(Article article);

    List<Article> findAll();

}
