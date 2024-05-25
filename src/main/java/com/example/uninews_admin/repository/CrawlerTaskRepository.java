package com.example.uninews_admin.repository;

import com.example.uninews_admin.model.CrawlerTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrawlerTaskRepository extends JpaRepository<CrawlerTask,Long> {
}
