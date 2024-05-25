package com.example.uninews_admin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long universityId;
    private String title;
    private String source;
    private Date date;
    private String content;
    private String url;
    private String picture;
    private String attachmentUrl;
    private Date crawlTime;
    private Date updateTime;
}
