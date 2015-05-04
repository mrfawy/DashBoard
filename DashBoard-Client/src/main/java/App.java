import com.google.gson.Gson;
import com.nationwide.dashboard.client.exception.DashBoardClientException;
import com.nationwide.dashboard.client.model.Property;
import com.nationwide.dashboard.client.model.service.*;
import com.nationwide.dashboard.client.service.DefaultSettingsService;
import com.nationwide.dashboard.client.service.Service;
import com.nationwide.dashboard.client.service.TokenSettingsService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdelm2 on 5/4/2015.
 */

public class App {

    public static void main(String[] args) {
        DefaultSettingsService s=new DefaultSettingsService("localhost","8008");
        CreateDefaultSettingsRequest req=new CreateDefaultSettingsRequest();

        try {
            req.setEnv("ST");
            req.setApp("ME");
            req.setUserName("root");
            req.setPassword("root");
            req.setServices(new ArrayList<com.nationwide.dashboard.client.model.Service>());

            com.nationwide.dashboard.client.model.Service RAService=new com.nationwide.dashboard.client.model.Service("RetreiveAccounts");
            RAService.setProperties(new ArrayList<Property>());
            RAService.getProperties().add(new Property("Region","XClientRegion"));

            com.nationwide.dashboard.client.model.Service paymentHistorySvc=new com.nationwide.dashboard.client.model.Service("paymentHistory");
            paymentHistorySvc.setProperties(new ArrayList<Property>());
            paymentHistorySvc.getProperties().add(new Property("DataBase","XClientDataBase"));


            req.getServices().add(RAService);
            req.getServices().add(paymentHistorySvc);
            CreateDefaultSettingsResponse res = s.createDefaultSettings(req);
            System.out.print(res);
        } catch (DashBoardClientException e) {
            e.printStackTrace();
        }


    }
}
