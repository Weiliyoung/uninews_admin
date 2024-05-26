package com.example.uninews_admin.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "university_website_url")
    private String universityWebsiteUrl;

    @Column(name = "university_start_url")
    private String universityStartUrl;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    // Getters and setters
    // Constructors
    // Other necessary methods
}