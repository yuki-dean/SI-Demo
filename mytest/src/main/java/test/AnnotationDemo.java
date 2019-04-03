package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.http.dsl.Http;
import org.springframework.integration.xml.transformer.AbstractXmlTransformer;
import org.springframework.integration.xml.transformer.MarshallingTransformer;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import test.model.weatherRequest.GetWeather;

import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ComponentScan
@Configuration
@EnableAutoConfiguration

public class AnnotationDemo {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = SpringApplication.run(AnnotationDemo.class);
        MessageChannel inChannel = context.getBean("inChannel", DirectChannel.class);
        MessageChannel outChannel = context.getBean("outChannel", QueueChannel.class);
        GetWeather gw = new GetWeather("792", "001");
        Message sndMsg = new GenericMessage(gw);
        inChannel.send(sndMsg);
        Message rcvMsg = ((QueueChannel) outChannel).receive();
        Object payload = rcvMsg.getPayload();
        System.out.println("Type of payload:" + payload.getClass());
        System.out.println("Payload: " + payload.toString());
        System.in.read();
        context.close();
    }

    @Bean
    public MessageChannel inChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel outChannel() {
        return new QueueChannel(10);
    }


    @Bean
    @Transformer(inputChannel = "inChannel", outputChannel = "outChannel")
    public MarshallingTransformer marshallTransform() {
        MarshallingTransformer transformer = null;
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(GetWeather.class);
        Map<String, Boolean> properties = new HashMap<String,Boolean>();
        properties.put(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setMarshallerProperties(properties);
        try {
            transformer = new MarshallingTransformer(marshaller);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        transformer.setResultType(AbstractXmlTransformer.STRING_RESULT);
        return transformer;
    }

}
