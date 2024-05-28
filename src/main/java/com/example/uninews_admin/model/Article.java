package com.example.uninews_admin.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "university_id")
    private int universityId;

    private String title;

    private String source;

    private Date date;

    private String content;

    private String url;

    private String picture;

    @Column(name = "attachment_url")
    private String attachmentUrl;

    @Column(name = "crawl_time")
    private Date crawlTime;

    @Column(name = "update_time")
    private Date updateTime;

    // Getters and setters
    // Constructors
    // Other necessary methods
}