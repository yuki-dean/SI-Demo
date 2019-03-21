package com.caih.iexp;

public class MyService {
    public String sayHello(String input){
        System.out.println( "say hello " + input );
        return "say hello " + input;
    }

    public void display(String input){
        System.out.println( "Display " + input );
    }
}
