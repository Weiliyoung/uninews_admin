package com.example.uninews_admin.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Map;

@Entity
public class CrawlerTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @Column(name = "parameters")
    private String parametersAsString;

    @Column(name = "crawl_time")
    private Date crawlTime;

    // Getters and Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParametersAsString() {
        return parametersAsString;
    }

    public void setParametersAsString(String parametersAsString) {
        this.parametersAsString = parametersAsString;
    }

    public Date getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(Date crawlTime) {
        this.crawlTime = crawlTime;
    }

}
