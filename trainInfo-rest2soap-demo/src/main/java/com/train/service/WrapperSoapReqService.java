package com.train.service;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.xml.transform.StringResult;

@Service("wrapperSoapReqService")
public class WrapperSoapReqService {
    public Message<String> wrapperSoapReq(StringResult result) {
        String xmlContent = result.toString();
        System.out.println("xmlContent:" + xmlContent);
//        xmlContent = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
//                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
//                "  <soap:Body>\n" +
//                "    <getDetailInfoByTrainCode xmlns=\"http://WebXml.com.cn/\">\n" +
//                "      <TrainCode>G2901</TrainCode>\n" +
//                "      <UserID></UserID>\n" +
//                "    </getDetailInfoByTrainCode>\n" +
//                "  </soap:Body>\n" +
//                "</soap:Envelope>";
//        xmlContent =
//                "<getDetailInfoByTrainCode xmlns=\"http://WebXml.com.cn/\">\n" +
//                "      <TrainCode>G2901</TrainCode>\n" +
//                "      <UserID></UserID>\n" +
//                "    </getDetailInfoByTrainCode>";
        Message<String> message = MessageBuilder
                .withPayload(xmlContent)
                .setHeader("Content-Type", "text/soap+xml; charset=utf-8")
                .build();
        System.out.println("message.header:" + message.getHeaders());
        System.out.println("message.payload:" + message.getPayload());

        return message;
    }
}
