package com.example.uninews_admin.repository;

import com.example.uninews_admin.model.CrawlerTask;
import com.example.uninews_admin.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrawlerTaskRepository extends JpaRepository<CrawlerTask, Integer> {
    List<CrawlerTask> findByUniversityId(Integer universityId);
}

