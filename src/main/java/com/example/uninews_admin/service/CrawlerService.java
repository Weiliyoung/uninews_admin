package com.example.uninews_admin.service;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.repository.CrawlerTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CrawlerService {
    @Autowired
    private CrawlerTaskRepository crawlerTaskRepository;

    public boolean addCrawlerTask(CrawlerTask crawlerTask) {
        try {
            crawlerTaskRepository.save(crawlerTask);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
