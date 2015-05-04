package com.nationwide.dashboard.client.model.service;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class RetrieveTokenSettingsRequest {
    private String env;
    private String app;
    private String token;

    public RetrieveTokenSettingsRequest(String env, String app, String token) {
        this.env = env;
        this.app = app;
        this.token = token;
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
}
