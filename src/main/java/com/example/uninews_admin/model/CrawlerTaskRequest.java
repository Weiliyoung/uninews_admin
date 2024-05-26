package com.example.uninews_admin.model;

import java.util.Map;

public class CrawlerTaskRequest {
    private String url;
    private Map<String, String> parameters;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}
