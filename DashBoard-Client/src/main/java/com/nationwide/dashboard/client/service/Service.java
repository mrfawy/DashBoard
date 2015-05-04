package com.nationwide.dashboard.client.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public abstract class Service {

    private String dashBoardHost;
    private String dashBoardPort;

    public Service() {
    }

    public Service(String dashBoardHost, String dashBoardPort) {
        this.dashBoardHost = dashBoardHost;
        this.dashBoardPort = dashBoardPort;
    }

    protected WebResource getClientResource(){
        Client client = Client.create();

        WebResource webResource = client
                .resource("http://"+dashBoardHost+":"+dashBoardPort);
        return webResource;
    }
}
