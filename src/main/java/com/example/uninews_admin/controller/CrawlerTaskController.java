package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.service.CrawlerTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CrawlerTask")
public class CrawlerTaskController {

    @Autowired
    private CrawlerTaskService crawlerTaskService;

    // 增加爬虫
    @PostMapping
    public ResponseEntity<?> addCrawlerTask(@RequestBody CrawlerTask crawlerTask) {
        try {
            CrawlerTask savedTask = crawlerTaskService.addCrawlerTask(crawlerTask);
            return ResponseEntity.ok().body(savedTask);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }

    // 删除爬虫
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCrawlerTask(@PathVariable Integer id) {
        try {
            crawlerTaskService.deleteCrawlerTask(id);
            return ResponseEntity.ok().body("爬虫任务删除成功");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }

    // 修改爬虫
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCrawlerTask(@PathVariable Integer id, @RequestBody CrawlerTask crawlerTask) {
        try {
            CrawlerTask updatedTask = crawlerTaskService.updateCrawlerTask(id, crawlerTask);
            return ResponseEntity.ok().body(updatedTask);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }

    // 查询爬虫
    @GetMapping
    public ResponseEntity<?> getCrawlerTasks(
            @RequestParam(required = false) Integer universityId,
            @RequestParam(required = false) String universityName,
            @RequestParam(required = false) Integer taskId) {
        try {
            List<CrawlerTask> tasks = crawlerTaskService.getCrawlerTasks(universityId, universityName, taskId);
            return ResponseEntity.ok().body(tasks);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
//    //根据学校名字查询爬虫任务
//    @GetMapping("/crawlerTaskByUniversity")
//    public List<CrawlerTask> getCrawlerTaskByUniversity(@RequestParam String universityName) {
//        return crawlerTaskService.getCrawlerTaskByUniversityName(universityName);
//    }

}
