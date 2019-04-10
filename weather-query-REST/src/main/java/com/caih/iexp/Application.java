package com.caih.iexp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:/META-INF/spring/integration/weather-integration-config3.xml")
public class Application {
//    public static final String CONFIG_PATH = "/META-INF/spring/integration/weather-integration-config3.xml";
    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext ctx = new SpringApplication(Application.class).run(args);
//        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_PATH, Application.class);
        System.out.println("Press Enter to terminate!");
        System.in.read();
        ctx.close();
    }
}
