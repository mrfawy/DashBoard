package com.nationwide.dashboard.client.model;

import java.util.List;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class Service {
    private String name;
    private List<Property> properties;

    public Service() {
    }

    public Service(String name) {
        this.name = name;
    }

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
