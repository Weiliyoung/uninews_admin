package com.example.uninews_admin.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityWebsiteUrl() {
        return universityWebsiteUrl;
    }

    public void setUniversityWebsiteUrl(String universityWebsiteUrl) {
        this.universityWebsiteUrl = universityWebsiteUrl;
    }

    public String getUniversityStartUrl() {
        return universityStartUrl;
    }

    public void setUniversityStartUrl(String universityStartUrl) {
        this.universityStartUrl = universityStartUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}