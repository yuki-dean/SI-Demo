package com.caih.iexp;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class Formater {
    private  final  String formater = "<base>%s</base>";
//    @EndpointId("formater")
    public Formater(){
        System.out.println("Formater .........");
        System.out.flush();
    }
    @ServiceActivator(inputChannel = "strInput", outputChannel = "input")
    public String  str2XML(String str){
        return String.format(formater, str);
    }
}
