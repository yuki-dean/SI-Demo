package com.train.service;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service("rest2SoapReqService")
public class Rest2SoapReqService {
    String format = "<getDetailInfoByTrainCode xmlns=\"http://WebXml.com.cn/\">\n" +
            "      <TrainCode>%S</TrainCode>\n" +
            "      <UserID></UserID>\n" +
            "    </getDetailInfoByTrainCode>";

    public Message<String> rest2SoapReq(String trainCode) {
        System.out.println("trainCode:" + trainCode);
        String xmlReq = String.format(format, trainCode);
        Message<String> message = MessageBuilder
                .withPayload(xmlReq)
                .setHeader("Content-Type", "text/soap+xml; charset=utf-8")
                .build();
        System.out.println("message.header:" + message.getHeaders());
        System.out.println("message.payload:" + message.getPayload());
        return message;
    }
}
