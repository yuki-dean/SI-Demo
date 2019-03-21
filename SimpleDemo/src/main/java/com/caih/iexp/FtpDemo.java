package com.caih.iexp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class FtpDemo {
    public static void main(String[] args){
        String cfg = "Simple.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(cfg);
        MessageChannel channel =
                context.getBean("strInput", MessageChannel.class);
        Message<String> message =
                MessageBuilder.withPayload("World").build();
        channel.send(message);
    }
}
