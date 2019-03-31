package com.lf.demo.jdsl;

import org.apache.tomcat.jni.Directory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.dsl.SourcePollingChannelAdapterSpec;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;
import org.springframework.integration.file.support.FileExistsMode;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

import java.io.File;
import java.util.function.Consumer;

/**
 * Transfer a file from directory a to b
 */
@Configuration
@EnableIntegration
public class FileTransfer {
    private String INBOUND_PATH = "target/source";
    private String OUTBOUND_PATH = "target/dest";

    @Bean(value = "fileSource")
    public MessageSource<File> fileReader(){
        FileReadingMessageSource source = new FileReadingMessageSource();
        source.setDirectory(new File(INBOUND_PATH));
        source.setFilter(new SimplePatternFileListFilter("*.txt"));
        System.out.println("Create a file source");
        return source;
    }


    @Bean("fileWriter2")
    public MessageHandler fileWritingMessageHandler2() {
//        Expression directoryExpression = new SpelExpressionParser().parseExpression("headers.directory");
        FileWritingMessageHandler handler = new FileWritingMessageHandler(new File(OUTBOUND_PATH+ "_new"));
        handler.setExpectReply(false);
//        handler.setFileExistsMode(FileExistsMode.APPEND);
        handler.setFileExistsMode(FileExistsMode.REPLACE);
        return handler;
    }

    /**
     * activator
     * @return
     */
    @Bean("fileWriter")
    public MessageHandler fileWritingMessageHandler() {
//        Expression directoryExpression = new SpelExpressionParser().parseExpression("headers.directory");
        FileWritingMessageHandler handler = new FileWritingMessageHandler(new File(OUTBOUND_PATH));
        handler.setExpectReply(false);
//        handler.setFileExistsMode(FileExistsMode.APPEND);
        handler.setFileExistsMode(FileExistsMode.REPLACE);
        return handler;
    }


    @Bean(value = "myChannel")
   public MessageChannel myChannel(){
        return  new DirectChannel();
    }

    @Bean
    public IntegrationFlow flow(){
        return IntegrationFlows.from(fileReader(), configurer->configurer.poller(Pollers.fixedDelay(5000)) )
                .channel("myChannel")
//                .handle(fileWritingMessageHandler())
                .get();
//        return IntegrationFlows.from(fileReader(), new Consumer<SourcePollingChannelAdapterSpec>() {
//            @Override
//            public void accept(SourcePollingChannelAdapterSpec sourcePollingChannelAdapterSpec) {
//                sourcePollingChannelAdapterSpec.poller(Pollers.fixedDelay(5000));
//            }
//        }).channel("myChannel").handle(fileWritingMessageHandler()).get();
//        IntegrationFlows.from(fileReader()).handle(fileWritingMessageHandler()).get();
    }

/*
    @Bean
    public MessageChannel getJmsChannel(){
    }*/

    @Bean
    IntegrationFlow flow2(){
        return IntegrationFlows.from("myChannel").handle(fileWritingMessageHandler()).get();
    }

    @Bean
    IntegrationFlow flow3(){
        return IntegrationFlows.from("myChannel").handle(fileWritingMessageHandler2()).get();
    }
}
