package com.example.uninews_admin.model;

import jakarta.persistence.*;

import java.util.Map;

@Entity
public class CrawlerTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Article article;

    // Constructors, getters and setters
}
