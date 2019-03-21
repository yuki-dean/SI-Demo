package rest2sopa;

import org.springframework.integration.annotation.EndpointId;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint()
public class R2SoapTrans {
    final  String formatStr = "<getWeatherbyCityName xmlns=\"http://WebXml.com.cn/\"> <theCityName>%s</theCityName> </getWeatherbyCityName>";
    @EndpointId("r2x")
    @ServiceActivator(inputChannel = "receiveChannel", outputChannel = "afterTrans")
    public String getCityByNameFromPath(String cityName){
        String xmlRequest = String.format(formatStr, cityName);
        System.out.println("transform data ........" + xmlRequest);
//        log.info("xml request: " + xmlRequest);
        return xmlRequest;
    }
}
