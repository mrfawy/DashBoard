package com.nationwide.dashboard.client.model.service;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class RetrieveApplicationTemplateRequest {

    private String app;

    public RetrieveApplicationTemplateRequest(String app) {
        this.app = app;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
}
