package com.example.uninews_admin.service;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.repository.CrawlerTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CrawlerTaskService {

    private final CrawlerTaskRepository crawlerTaskRepository;

    @Autowired
    public CrawlerTaskService(CrawlerTaskRepository crawlerTaskRepository) {
        this.crawlerTaskRepository = crawlerTaskRepository;
    }

    public CrawlerTask createTask(CrawlerTask crawlerTask) {
        return crawlerTaskRepository.save(crawlerTask);
    }

    public List<CrawlerTask> getAllTasks() {
        return crawlerTaskRepository.findAll();
    }

    public CrawlerTask getTaskById(Integer id) {
        return crawlerTaskRepository.findById(id).orElse(null);
    }

    public CrawlerTask updateTask(CrawlerTask crawlerTask) {
        return crawlerTaskRepository.save(crawlerTask);
    }

    public void deleteTask(Integer id) {
        crawlerTaskRepository.deleteById(id);
    }
}
