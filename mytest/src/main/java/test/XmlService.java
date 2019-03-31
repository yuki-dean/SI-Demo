package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;
import test.model.weatherRequest.Body;
import test.model.weatherRequest.GetWeather;
import test.model.weatherRequest.WeatherRequest;

@Service("xmlService")
public class XmlService {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/xmlMarshaller-config.xml", XmlService.class);
        MessageChannel inChannel = context.getBean("in-channel", MessageChannel.class);
        PollableChannel outChannel = context.getBean("out-channel", PollableChannel.class);
        GetWeather gw = new GetWeather();
        gw.setTheCityCode("792");
        Body body = new Body();
        body.setGetWeather(gw);
        WeatherRequest wr = new WeatherRequest();
        wr.setBody(body);
        Message msg = new GenericMessage<WeatherRequest>(wr);
        inChannel.send(msg);
        Message rcvMsg = outChannel.receive();
        Object payload = rcvMsg.getPayload();
        System.out.println("Type of Payload:" + payload.getClass());
        System.out.println("Payload: " + payload.toString());
//        System.out.println("==========" + outChannel.receive() + "=============");
        context.close();
    }
}
