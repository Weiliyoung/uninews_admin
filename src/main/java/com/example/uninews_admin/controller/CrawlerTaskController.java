package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.service.CrawlerTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CrawlerTask")
public class CrawlerTaskController {
    private final CrawlerTaskService crawlerTaskService;

    @Autowired
    public CrawlerTaskController(CrawlerTaskService crawlerTaskService) {
        this.crawlerTaskService = crawlerTaskService;
    }

    @PostMapping
    public CrawlerTask createTask(@RequestBody CrawlerTask crawlerTask) {
        return crawlerTaskService.createTask(crawlerTask);
    }

    @GetMapping
    public List<CrawlerTask> getAllTasks() {
        return crawlerTaskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public CrawlerTask getTaskById(@PathVariable Integer id) {
        return crawlerTaskService.getTaskById(id);
    }

    @PutMapping("/{id}")
    public CrawlerTask updateTask(@PathVariable Integer id, @RequestBody CrawlerTask crawlerTask) {
        crawlerTask.setId(id);
        return crawlerTaskService.updateTask(crawlerTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Integer id) {
        crawlerTaskService.deleteTask(id);
    }

    //根据学校名字查询爬虫任务
    @GetMapping("/crawlerTaskByUniversity")
    public List<CrawlerTask> getCrawlerTaskByUniversity(@RequestParam String universityName) {
        return crawlerTaskService.getCrawlerTaskByUniversityName(universityName);
    }

}
