package com.nationwide.dashboard.client.model.service;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class RetrieveServiceSettingsRequest {

    private String env;
    private String app;
    private String token;
    private String service;

    public RetrieveServiceSettingsRequest(String env, String app, String token, String service) {
        this.env = env;
        this.app = app;
        this.token = token;
        this.service = service;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
