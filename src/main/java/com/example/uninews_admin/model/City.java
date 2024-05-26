package com.example.uninews_admin.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    // Getters and setters
    // Constructors
    // Other necessary methods
}