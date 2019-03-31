package com.lf.demo.jdsl;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.file.dsl.Files;

import java.io.File;

@SpringBootApplication
public class FileReaderApp {

    private final String INBOUND_PATH = "target/source";

    /*public static void main(String[] args){
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(FileTransfer.class);
        Object obj = ctx.getBean("fileSource");
        Object obj2 = ctx.getBean("fileSource");

        System.out.println(obj.getClass().getName());
        if(obj instanceof MessageSource){
            System.out.println("object is message source");
            System.out.println(obj == obj2);
        }
    }*/

    public static void main(String[] args) {
        new SpringApplicationBuilder(FileReaderApp.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

//    @Bean
    /*
    public IntegrationFlow fileReadingFlow() {
        return IntegrationFlows
                .from(s -> s.file(new File(INBOUND_PATH))
                                .patternFilter("*.txt"),
                        e -> e.poller(Pollers.fixedDelay(1000)))
                .transform(Files.toStringTransformer())
                .channel("processFileChannel")
                .get();
    }
    */

}
