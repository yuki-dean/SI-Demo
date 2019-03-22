package com.caih.iexp.restProcessor;

import com.caih.iexp.model.GenericResp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.EndpointId;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service("restProcessor")
//@Component("restProcessor")
public class RestProcessor {
//    private static Log log = LogFactory.getLog(RestProcessor.class);
//    @ServiceActivator //(inputChannel = "requestChan", outputChannel = "reply")
    public Message<String> get(Message<String> msg) {
//        System.out.println("==========================================");
        log.info("==========================================");
        Object header = msg.getHeaders();
        Object payload = msg.getPayload();
//        System.out.println(header.toString());
//        System.out.println(payload.toString());
        log.info(header.toString());
        log.info(payload.toString());
        GenericMessage<String> message= null;  //= new GenericMessage<String>("hellooooooooo!");
        /**
         * return a response as { "code" :200,  "message":"helloworld"}
         */
        GenericResp resp = GenericResp.builder().code(200).message("helloworld").build();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            message = new GenericMessage<String>( objectMapper.writeValueAsString(resp) );
            log.info("get a response:" + message);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return message;
    }
}
