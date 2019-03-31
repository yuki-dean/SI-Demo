package com.caih.iexp.utils;

import com.caih.iexp.model.weatherRequest.GetWeather;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

@Slf4j
@Service("weatherService")
//@Component("restProcessor")
public class JsonUtil {
    public Message<String> json2Bean (Message<GetWeather> msg) {
         MessageHeaders header = msg.getHeaders();
         GetWeather payload = msg.getPayload();
        log.info("Header: " + header.toString());
        log.info("Payload: " + payload.getClass());
//        log.info("Payload: " + payload.getGetWeather());

//        GetWeather respGetWeather = new GetWeather("792", "test");
//        Jackson2JsonObjectMapper mapper = ObjectMapperFactory.getMapper();
//        String respJson = null;
//        try {
//            respJson = mapper.toJson(respGetWeather);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        GenericMessage message = new GenericMessage("hello");
        return message;
    }

   /* public Message<String> getXml(Message<GetWeather> rcvMsg) {
        String FILE_NAME = "target/test.xml";
        Marshaller marshaller;
        GetWeather cityCode = rcvMsg.getPayload();

    }*/

  /*  public static class GetWeather {

        private String theGetWeather;
        private String theUserId;

        public GetWeather() {
        }

        public GetWeather(String theGetWeather, String theUserId){
            this.theGetWeather = theGetWeather;
            this.theUserId = theUserId;
        }

        public String getTheGetWeather() {
            return theGetWeather;
        }

        public String getTheUserId() {
            return theUserId;
        }

    //    @Override
    //    public String toString() {
    //        return "theGetWeather:" + theGetWeather + "," + "theUserId:" + theUserId;
    //    }
    }*/
}
