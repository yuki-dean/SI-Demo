package com.caih.iexp.rest2sopa;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@MessageEndpoint()
public class R2SoapTrans {
    final  String formatStr = "<getWeatherbyCityName xmlns=\"http://WebXml.com.cn/\"> <theCityName>%s</theCityName> </getWeatherbyCityName>";
    @ServiceActivator
    public String getCityByNameFromPath(String cityName){
        String xmlRequest = String.format(formatStr, cityName);
        log.info("xml request: " + xmlRequest);
        return xmlRequest;
    }
}
