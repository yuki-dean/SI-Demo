package com.train.weather;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.channel.BeanFactoryChannelResolver;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.core.DestinationResolver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Xml2Bean {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext
                ("/META-INF/spring/integration/xml-bean-weather-transformer.xml");
        DestinationResolver<MessageChannel> channelResolver =
                new BeanFactoryChannelResolver(act);
        String content = "";
        InputStream in = Xml2Bean.class.getClassLoader().getResourceAsStream("response1.xml");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            StringBuffer stringBuffer = new StringBuffer();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer = stringBuffer.append(line);
            }
            content = stringBuffer.toString();
            in.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("content:" + content);
        Message<String> message = MessageBuilder.withPayload(content).build();
        MessageChannel channel = channelResolver.resolveDestination("weaInput");
        channel.send(message);
    }
}
