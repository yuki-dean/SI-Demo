package com.lf.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.http.inbound.RequestMapping;
import org.springframework.integration.webflux.inbound.WebFluxInboundEndpoint;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableAutoConfiguration
@EnableWebFlux
@EnableIntegration
public class ReactiveHttpConfiguration {

    public static void main(String[] args){
        ConfigurableApplicationContext ctx = SpringApplication.run(ReactiveHttpConfiguration.class, args);

    }
    @Bean
    public WebFluxInboundEndpoint simpleInboundEndpoint() {
        WebFluxInboundEndpoint endpoint = new WebFluxInboundEndpoint();
        RequestMapping requestMapping = new RequestMapping();
        requestMapping.setPathPatterns("/test");
        endpoint.setRequestMapping(requestMapping);
        endpoint.setRequestChannelName("serviceChannel");
        return endpoint;
    }

    @Bean
    public WebFluxInboundEndpoint simpleInboundEndpoint2() {
        WebFluxInboundEndpoint endpoint = new WebFluxInboundEndpoint();
        RequestMapping requestMapping = new RequestMapping();
        requestMapping.setPathPatterns("/hello", "/helloagain");
        endpoint.setRequestMapping(requestMapping);
        endpoint.setRequestChannelName("serviceChannel2");
        return endpoint;
    }
    public void simpleOutboundEndpoint(){
    }
    @ServiceActivator(inputChannel = "serviceChannel")
    String service() {
        return "It works!";
    }

    @ServiceActivator(inputChannel = "serviceChannel2")
    String service2() {
        return "It also works!";
    }

}
