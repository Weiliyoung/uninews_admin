package com.example.uninews_admin.service;

import com.example.uninews_admin.model.Article;
import com.example.uninews_admin.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Page<Article> getArticleList(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }
}
