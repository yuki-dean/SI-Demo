package com.caih.iexp.utils;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class WsWrapper {

    public Message<String> addHeader(Message msg) {
        Message<String> retMsg = MessageBuilder.withPayload(msg.getPayload().toString())
                .setHeader("Content-Type", "application/xml; charset=utf-8")
                .build();
        return retMsg;

    }
}
