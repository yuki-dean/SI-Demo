package com.caih.iexp.weatherQueryREST;

import com.caih.iexp.model.CityCode;
import com.caih.iexp.model.GenericResp;
import com.caih.iexp.model.ObjectMapperFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.EndpointId;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.json.Jackson2JsonObjectMapper;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.support.GenericMessage;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service("weatherService")
//@Component("restProcessor")
public class WeatherService {
    public Message<String> post(Message<CityCode> msg) {
         MessageHeaders header = msg.getHeaders();
         CityCode payload = msg.getPayload();
        log.info("Header: " + header.toString());
        log.info("Payload: " + payload.getClass());
        log.info("Payload: " + payload.getTheCityCode());

        /**
         * return a response as {"":"","":""}
         */

        CityCode respCityCode = new CityCode("792", "test");
        Jackson2JsonObjectMapper mapper = ObjectMapperFactory.getMapper();
        String respJson = null;
        try {
            respJson = mapper.toJson(respCityCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        GenericMessage message = new GenericMessage(respJson);
        return message;
    }
}
