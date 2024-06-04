package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.Article;
import com.example.uninews_admin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class GetArticleListController {

    private final ArticleService articleService;

    @Autowired
    public GetArticleListController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/GetArticleList")
    public Map<String, Object> getArticleList(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortField,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        PageRequest pageRequest = PageRequest.of(page, size, sort);

        Page<Article> articlePage = articleService.getArticleList(pageRequest);

        Map<String, Object> response = new HashMap<>();
        response.put("articles", articlePage.getContent());
        response.put("currentPage", articlePage.getNumber());
        response.put("totalItems", articlePage.getTotalElements());
        response.put("totalPages", articlePage.getTotalPages());

        return response;
    }
}
