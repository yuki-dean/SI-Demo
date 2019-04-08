package com.lf;

import com.github.lf.si.webflux.WebfluxConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(WebfluxConfig.class);
    }
}
