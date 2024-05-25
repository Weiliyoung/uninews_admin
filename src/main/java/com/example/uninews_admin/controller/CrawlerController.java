package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.service.CrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CrawlerController {
    @Autowired
    private CrawlerService crawlerService;

    @PostMapping("/addCrawlerTask")
    public String addCrawlerTask(@RequestBody CrawlerTask crawlerTask) {
        boolean success = crawlerService.addCrawlerTask(crawlerTask);
        if (success) {
            return "Crawler task added successfully";
        } else {
            return "Failed to add crawler task";
        }
    }
}
