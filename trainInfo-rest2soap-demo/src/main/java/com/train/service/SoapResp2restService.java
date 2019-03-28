package com.train.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service("soapResp2restService")
public class SoapResp2restService {
    /**
     * {"code":200,"message":"OK"}
     */
    public String soapResp2rest(Message message) throws Exception {
        System.out.println("soapResp2rest.message.header:" + message.getHeaders());
        System.out.println("soapResp2rest.message.payload:" + message.getPayload());
        String resp = (String) message.getPayload();
        String[] resps = resp.split("getDetailInfo");
        String respXml = "";
        for (String r : resps) {
            if (r.contains("TrainDetailInfo")) {
                respXml = "<getDetailInfo" + r + "getDetailInfo>";
            }
        }
        System.out.println("resp:" + respXml);
        return "{\"code\":200,\"message\":\"OK\"}";
    }
}
