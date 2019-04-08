package com.github.lf.si.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Demo {

    public static void main(String[] args){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(WebfluxConfig.class);
    }
}
