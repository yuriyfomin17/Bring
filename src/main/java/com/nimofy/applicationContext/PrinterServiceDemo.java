package com.nimofy.applicationContext;

import com.nimofy.applicationContext.annotations.Autowire;
import com.nimofy.applicationContext.annotations.Bean;

@Bean
public class PrinterServiceDemo {

    public PrinterServiceDemo() {
    }

    @Autowire
    private MessageServiceDemo messageServiceDemo;

    public String getMessage(){
        return messageServiceDemo.getMessage();
    }
    public void printMessage() {
        System.out.println(getMessage());
    }
}
