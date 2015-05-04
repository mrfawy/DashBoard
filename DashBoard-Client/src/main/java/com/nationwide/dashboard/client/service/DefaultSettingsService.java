package com.nationwide.dashboard.client.service;

import com.google.gson.Gson;
import com.nationwide.dashboard.client.exception.DashBoardClientException;
import com.nationwide.dashboard.client.model.service.*;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class DefaultSettingsService extends Service {
    public DefaultSettingsService(String dashBoardHost, String dashBoardPort) {
        super(dashBoardHost, dashBoardPort);
    }

    public RetrieveApplicationTemplateResponse retrieveApplicationTemplate(RetrieveApplicationTemplateRequest req)throws DashBoardClientException{
        WebResource webResource = getClientResource();
        try{
            ClientResponse response = webResource.path("/api/settings/template/" + req.getApp()).get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new DashBoardClientException("Failed : HTTP error code : "+ response.getStatus());
            }

            String output = response.getEntity(String.class);

            RetrieveApplicationTemplateResponse res= new Gson().fromJson(output, RetrieveApplicationTemplateResponse.class);
            return res;
        }
        catch (Exception e){
            e.printStackTrace();
            throw new DashBoardClientException(e);
        }
    }

    public CreateDefaultSettingsResponse createDefaultSettings(CreateDefaultSettingsRequest req)throws DashBoardClientException{
        WebResource webResource = getClientResource();
        try{
            String servicesJsonStr=new Gson().toJson(req.getServices());
            String body="{\"auth\":{\"user\":\""+req.getUserName()+"\",\"password\":\""+req.getPassword()+"\"},\"services\":"+servicesJsonStr+"}";

            ClientResponse response = webResource.path("/api/settings/default/" + req.getEnv()+"/"+req.getApp()).type("application/json").post(ClientResponse.class,body);

            if (response.getStatus() != 200) {
                throw new DashBoardClientException("Failed : HTTP error code : "+ response.getStatus());
            }

            String output = response.getEntity(String.class);

           return new CreateDefaultSettingsResponse();
        }
        catch (Exception e){
            e.printStackTrace();
            throw new DashBoardClientException(e);
        }
    }

}
