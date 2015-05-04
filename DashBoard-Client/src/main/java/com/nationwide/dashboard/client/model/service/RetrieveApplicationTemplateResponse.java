package com.nationwide.dashboard.client.model.service;



import com.nationwide.dashboard.client.model.Service;

import java.util.List;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class RetrieveApplicationTemplateResponse {
    private String name;
    private List<Service> services;

    public RetrieveApplicationTemplateResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
