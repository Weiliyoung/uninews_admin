package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.Article;
import com.example.uninews_admin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GetArticleListController {

    private final ArticleService articleService;

    @Autowired
    public GetArticleListController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/GetArticleList")
    public List<Article> getArticleList() {
        return articleService.getArticleList();
    }
}
