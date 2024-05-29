package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.Article;
import com.example.uninews_admin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class GetArticleListController {

    private final ArticleService articleService;

    // 添加日志记录器
    private static final Logger logger = LoggerFactory.getLogger(GetArticleListController.class);

    @Autowired
    public GetArticleListController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/GetArticleList")
    public List<Article> getArticleList() {
        // 在方法开始时打印日志
        logger.info("开始获取文章列表");

        // 调用服务层方法获取文章列表
        List<Article> articles = articleService.getArticleList();

        // 打印日志，输出获取到的文章数量
        logger.info("获取到的文章数量: {}", articles.size());

        // 返回获取到的文章列表
        return articles;
    }
}
