package com.lf.demo.jdsl;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.integration.core.MessageSource;

public class Main {

    public static void main(String[] args){
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(FileTransfer.class);
        Object obj = ctx.getBean("fileSource");
        Object obj2 = ctx.getBean("fileSource");

        System.out.println(obj.getClass().getName());
        if(obj instanceof MessageSource){
            System.out.println("object is message source");
            System.out.println(obj == obj2);
        }
    }
}
