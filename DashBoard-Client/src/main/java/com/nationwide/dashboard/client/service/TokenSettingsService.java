package com.nationwide.dashboard.client.service;

import com.google.gson.Gson;
import com.nationwide.dashboard.client.exception.DashBoardClientException;
import com.nationwide.dashboard.client.model.service.RetrieveServiceSettingsRequest;
import com.nationwide.dashboard.client.model.service.RetrieveServiceSettingsResponse;
import com.nationwide.dashboard.client.model.service.RetrieveTokenSettingsRequest;
import com.nationwide.dashboard.client.model.service.RetrieveTokenSettingsResponse;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class TokenSettingsService extends Service{

    public TokenSettingsService(String dashBoardHost, String dashBoardPort) {
        super(dashBoardHost, dashBoardPort);
    }

    public RetrieveTokenSettingsResponse retrieveTokenSettings(RetrieveTokenSettingsRequest req)throws DashBoardClientException {
        WebResource webResource = getClientResource();
        try{
            ClientResponse response = webResource.path("/api/settings/" + req.getEnv()+"/"+req.getApp()+"/"+req.getToken()).get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new DashBoardClientException("Failed : HTTP error code : "+ response.getStatus());
            }

            String output = response.getEntity(String.class);

            RetrieveTokenSettingsResponse res= new Gson().fromJson(output, RetrieveTokenSettingsResponse.class);
            return res;
        }
        catch (Exception e){
            e.printStackTrace();
            throw new DashBoardClientException(e);
        }
    }
    public RetrieveServiceSettingsResponse retrieveServiceSettings(RetrieveServiceSettingsRequest req) throws DashBoardClientException{
        WebResource webResource = getClientResource();
        try{
            ClientResponse response = webResource.path("/api/settings/" + req.getEnv()+"/"+req.getApp()+"/"+req.getToken()+"/"+req.getService()).get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new DashBoardClientException("Failed : "+response);
            }

            String output = response.getEntity(String.class);

            RetrieveServiceSettingsResponse res= new Gson().fromJson(output, RetrieveServiceSettingsResponse.class);
            return res;
        }
        catch (Exception e){
            e.printStackTrace();
            throw new DashBoardClientException(e);
        }
    }

}
