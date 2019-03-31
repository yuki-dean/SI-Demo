package com.caih.iexp.utils;


import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class XmlCheck {
    public Message check(Message msg) {
        return MessageBuilder.withPayload(msg.getPayload()).setHeader("Content-Type", "application/json").build();
    }
}
