package com.github.lf.si.webflux;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.http.inbound.RequestMapping;
import org.springframework.integration.webflux.dsl.WebFlux;
import org.springframework.integration.webflux.inbound.WebFluxInboundEndpoint;
import reactor.core.publisher.Flux;

@Configuration
@EnableAutoConfiguration
//@IntegrationComponentScan
public class WebfluxConfig {
    @Bean
    public WebFluxInboundEndpoint simpleInboundEndpoint() {
        WebFluxInboundEndpoint endpoint = new WebFluxInboundEndpoint();
        RequestMapping requestMapping = new RequestMapping();
        requestMapping.setPathPatterns("/test");
        endpoint.setRequestMapping(requestMapping);
        endpoint.setRequestChannelName("serviceChannel");
        return endpoint;
    }

    @ServiceActivator(inputChannel = "serviceChannel")
    String service() {
        return "It works!";
    }

    @Bean
    public IntegrationFlow ss2Flow() {
        return IntegrationFlows
                .from(WebFlux.inboundGateway("/ssf"))
                .handle((p, h)->{
                    System.out.println(h);
                    return p;
                })
                .get();
    }
    @Bean
    public IntegrationFlow sseFlow() {
        return IntegrationFlows
                .from(WebFlux.inboundGateway("/sse")
                        .requestMapping(m -> m.produces(MediaType.TEXT_EVENT_STREAM_VALUE)))
                .handle((p, h) -> Flux.just("foo", "bar", "baz"))
                .get();
    }

}
