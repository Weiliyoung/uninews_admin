package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.service.CrawlerTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CrawlerTaskController {
    private final CrawlerTaskService crawlerTaskService;

    @Autowired
    public CrawlerTaskController(CrawlerTaskService crawlerTaskService) {
        this.crawlerTaskService = crawlerTaskService;
    }

    @GetMapping("/tasks")
    public List<CrawlerTask> getAllTasks() {
        return crawlerTaskService.getAllTasks();
    }

    @PostMapping("/tasks")
    public CrawlerTask createTask(@RequestBody CrawlerTask crawlerTask) {
        return crawlerTaskService.createTask(crawlerTask);
    }

    @PutMapping("/tasks")
    public CrawlerTask updateTask(@RequestBody CrawlerTask crawlerTask) {
        return crawlerTaskService.updateTask(crawlerTask);
    }
}
