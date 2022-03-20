package com.ycshang.boot.jpa.service.impl;


import com.ycshang.boot.jpa.dao.ArticleRepository;
import com.ycshang.boot.jpa.entity.Article;
import com.ycshang.boot.jpa.service.ArticleService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
;import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @description:
 * @author: ycshang
 * @date: 2022/3/18
 **/
@Service
public class ArticleJpaServiceImpl implements ArticleService {

    @Resource
    private ArticleRepository articleRepository;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void deleteById(int id) {
        articleRepository.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public List<Article> selectAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article findById(int id) {
        Optional<Article> optional = articleRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public List<Article> findByAuthor(String author) {
        return articleRepository.findByAuthor(author);
    }

    @Override
    public Page<Article> findArticleCriteria(Integer page, Integer size, final Article article) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "id");
        Page<Article> articlePage = articleRepository.findAll(new Specification<Article>() {
            @Override
            public Predicate toPredicate(Root<Article> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<Predicate>();

                if (null != article.getTitle() && !"".equals(article.getTitle())) {
                    list.add(criteriaBuilder.equal(root.get("title").as(String.class), article.getTitle()));
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        }, pageable);
        return articlePage;
    }

    @Override
    public Page<Article> findArticleNotCriteria(Integer page, Integer size) {
        Sort sort;
        Pageable pageable = PageRequest.of(page, size);
        return articleRepository.findAll(pageable);
    }
}
