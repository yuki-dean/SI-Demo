package com.caih.iexp.restProcessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("restProcessor")
@Component
public class RestProcessor {
    private static Log log = LogFactory.getLog(RestProcessor.class);

    public Message<String> get(Message<String> msg) {
//        System.out.println("==========================================");
        log.info("==========================================");
        Object header = msg.getHeaders();
        Object payload = msg.getPayload();
//        System.out.println(header.toString());
//        System.out.println(payload.toString());
        log.info(header.toString());
        log.info(payload.toString());
        GenericMessage<String> message = new GenericMessage<String>("hellooooooooo!");
        return message;
    }
}
