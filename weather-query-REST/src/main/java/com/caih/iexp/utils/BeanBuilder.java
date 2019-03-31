package com.caih.iexp.utils;

import com.caih.iexp.model.weatherResponse.GetWeatherResponse;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class BeanBuilder {

    public Message<GetWeatherResponse> getJsonBean(Message<GetWeatherResponse> msg) {
        GetWeatherResponse gwr = msg.getPayload();
        Message retMsg = MessageBuilder.createMessage(gwr, msg.getHeaders());
        return retMsg;
    }
}
