package com.example.uninews_admin.controller;

import com.example.uninews_admin.model.CrawlerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
//@RequestMapping("/addCrawler")
public class CrawlerController {
    private final CrawlerController CrawlerService;

    @Autowired
    public CrawlerController(CrawlerController crawlerController){
        this.crawlerService = crawlerController;
    }
    @PostMapping("/addCrawler")
    public ResponseEntity<String> addSpiderTask(@RequestBody CrawlerTask crawlerTask) {
        try {
            crawlerService.addSpiderTask(crawlerTask);
            return ResponseEntity.ok("Spider task added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add spider task: " + e.getMessage());
        }
    }
}
