package com.example.uninews_admin.service;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.repository.CrawlerTaskRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class CrawlerService {
    @Autowired
    private CrawlerTaskRepository crawlerTaskRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public boolean addCrawlerTask(String url, Map<String, String> parameters) {
        try {
            CrawlerTask crawlerTask = new CrawlerTask();
            crawlerTask.setUrl(url);
            crawlerTask.setParametersAsString(objectMapper.writeValueAsString(parameters)); // 设置参数字符串
            crawlerTask.setCrawlTime(new Date());
            crawlerTaskRepository.save(crawlerTask);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
