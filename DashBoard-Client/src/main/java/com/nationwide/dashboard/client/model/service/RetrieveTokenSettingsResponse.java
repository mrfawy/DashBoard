package com.nationwide.dashboard.client.model.service;

import com.nationwide.dashboard.client.model.Service;

import java.util.List;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class RetrieveTokenSettingsResponse {
    private String app;
    private String env;
    private String owner;
    private String token;

    private List<Service> services;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
