package com.example.uninews_admin.service;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.model.University;
import com.example.uninews_admin.repository.CrawlerTaskRepository;
import com.example.uninews_admin.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CrawlerTaskService {
    @Autowired
    private CrawlerTaskRepository crawlerTaskRepository;

    @Autowired
    private UniversityRepository universityRepository;

    // 增加爬虫
    public CrawlerTask addCrawlerTask(CrawlerTask crawlerTask) {
        crawlerTask.setCreateTime(new Date());
        crawlerTask.setUpdateTime(new Date());
        return crawlerTaskRepository.save(crawlerTask);
    }

    // 删除爬虫
    public void deleteCrawlerTask(Integer id) {
        crawlerTaskRepository.deleteById(id);
    }

    // 修改爬虫
    public CrawlerTask updateCrawlerTask(Integer id, CrawlerTask crawlerTaskDetails) {
        Optional<CrawlerTask> optionalCrawlerTask = crawlerTaskRepository.findById(id);
        if (!optionalCrawlerTask.isPresent()) {
            throw new RuntimeException("爬虫任务未找到");
        }
        CrawlerTask crawlerTask = optionalCrawlerTask.get();
        crawlerTask.setUniversityId(crawlerTaskDetails.getUniversityId());
        crawlerTask.setName(crawlerTaskDetails.getName());
        crawlerTask.setUrl(crawlerTaskDetails.getUrl());
        crawlerTask.setStatus(crawlerTaskDetails.getStatus());
        crawlerTask.setUpdateTime(new Date());
        return crawlerTaskRepository.save(crawlerTask);
    }

    // 查询爬虫
    public List<CrawlerTask> getCrawlerTasks(Integer universityId, String universityName, Integer taskId) {
        if (taskId != null) {
            CrawlerTask task = crawlerTaskRepository.findById(taskId).orElse(null);
            return task != null ? List.of(task) : Collections.emptyList();
        } else if (universityId != null) {
            return crawlerTaskRepository.findByUniversityId(universityId);
        } else if (universityName != null) {
            University university = universityRepository.findByUniversityName(universityName);
            if (university != null) {
                return crawlerTaskRepository.findByUniversityId(university.getId());
            } else {
                return Collections.emptyList();
            }
        } else {
            return crawlerTaskRepository.findAll();
        }
    }
    //根据学校名字查爬虫任务
//    public List<CrawlerTask> getCrawlerTaskByUniversityName(String universityName) {
//        return crawlerTaskRepository.findByUniversity_UniversityName(universityName);
//    }
}
