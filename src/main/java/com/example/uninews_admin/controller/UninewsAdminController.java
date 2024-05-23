package com.example.uninews_admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class UninewsAdminController {
    @PostMapping("/start")
    public String startuninewsadmin(@RequestBody UninewsAdminRequest request) {
        return "UninewsAdmin start";
    }

    @PostMapping("/stop")
    public String stopCrawler(@RequestParam String taskId) {
        // 停止指定的爬虫任务
        return "Crawler stopped";
    }

    @GetMapping("/status")
    public String getCrawlerStatus(@RequestParam String taskId) {
        // 获取指定爬虫任务的状态
        return "Crawler status";
    }
}

class UninewsAdminRequest {
    private String url;
    private String taskId;
    // getter 和 setter 方法
}
