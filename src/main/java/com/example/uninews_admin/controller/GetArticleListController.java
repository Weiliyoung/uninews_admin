package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.Article;
import com.example.uninews_admin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class GetArticleListController {

    private static final Logger logger = LoggerFactory.getLogger(GetArticleListController.class);

    private final ArticleService articleService;

    @Autowired
    public GetArticleListController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/GetArticleList")
    public ResponseEntity<List<Article>> getArticleList(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortField,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        logger.info("开始获取文章列表");
        List<Article> articles = articleService.getArticleList(page, size, sortField, sortDirection);
        logger.info("获取到的文章数量: {}", articles.size());
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }
}
