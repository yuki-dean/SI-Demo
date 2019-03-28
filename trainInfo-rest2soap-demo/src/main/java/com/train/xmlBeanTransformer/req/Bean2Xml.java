package com.train.xmlBeanTransformer.req;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.channel.BeanFactoryChannelResolver;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.core.DestinationResolver;


public class Bean2Xml {
    public static void main(String args[]){
        ClassPathXmlApplicationContext act =
                new ClassPathXmlApplicationContext("META-INF/spring/integration/xml-bean-transformer.xml");
        DestinationResolver<MessageChannel> destinationResolver =
                new BeanFactoryChannelResolver(act);

        DetailInfoByTrainCodeReq req = new DetailInfoByTrainCodeReq();
        req.setTrainCode("G2901");
        req.setUserID("");
        Message<DetailInfoByTrainCodeReq> message =
                MessageBuilder.withPayload(req).build();

        MessageChannel channel = destinationResolver.resolveDestination("input2");
        channel.send(message);
    }
}
