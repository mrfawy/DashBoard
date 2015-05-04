package com.nationwide.dashboard.client.model.service;

import com.nationwide.dashboard.client.model.Property;

import java.util.List;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class RetrieveServiceSettingsResponse {

    private String name;
    private List<Property> properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
