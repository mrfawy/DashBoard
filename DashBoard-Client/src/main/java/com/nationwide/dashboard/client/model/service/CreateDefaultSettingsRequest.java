package com.nationwide.dashboard.client.model.service;

import com.nationwide.dashboard.client.model.Service;

import java.util.List;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class CreateDefaultSettingsRequest {
    private String userName;
    private String password;
    private String env;
    private String app;
    private List<Service> services;

    public CreateDefaultSettingsRequest() {
    }

    public CreateDefaultSettingsRequest(String userName, String password, String env, String app, List<Service> services) {
        this.userName = userName;
        this.password = password;
        this.env = env;
        this.app = app;
        this.services = services;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
