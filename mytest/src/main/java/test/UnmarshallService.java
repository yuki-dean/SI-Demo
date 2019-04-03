package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

import java.io.*;

@Service("UnmarshallService")
public class UnmarshallService {
        public static final String path = "E:\\workspace\\SI-Demo\\mytest\\src\\main\\resources\\weatherResponse.xml";
    public static void main(String[] args) throws Exception{
        File xmlFile = new File(path);
        InputStream in = null;
        StringReader stringReader = null;
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/xmlUnmarshaller-config.xml", UnmarshallService.class);
        MessageChannel fileInChannel = context.getBean("fileIn-channel", MessageChannel.class);
        PollableChannel printChannel = context.getBean("print-channel", PollableChannel.class);
        in = new FileInputStream(xmlFile);
        byte[] buf = new byte[(int)xmlFile.length()];
        in.read(buf,0,(int)xmlFile.length());
        String xmlStr = new String(buf);
        System.out.println("xml file:" + xmlStr);
        Message xmlMsg = new GenericMessage(xmlStr);
        fileInChannel.send(xmlMsg);
        Message rcvMsg = printChannel.receive();
        Object obj = rcvMsg.getPayload();
        System.out.println("payload type:" + obj.getClass());
//        System.out.println("==========" + outChannel.receive() + "=============");
        context.close();
    }
}
