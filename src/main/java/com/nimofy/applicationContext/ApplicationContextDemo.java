package com.nimofy.applicationContext;

import com.nimofy.applicationContext.applicationContext.ApplicationContext;
import com.nimofy.applicationContext.applicationContext.ApplicationContextImpl;

public class ApplicationContextDemo {
    private static final String packageName = "com.nimofy.applicationContext";
    private static final String message = "MY_MESSAGE_HELLO_WORLD";

    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new ApplicationContextImpl(packageName);
        MessageServiceDemo messageServiceDemo = applicationContext.getBean(MessageServiceDemo.class);
        messageServiceDemo.setMessage(message);
        PrinterServiceDemo printerServiceDemo = applicationContext.getBean(PrinterServiceDemo.class);
        printerServiceDemo.printMessage();
    }
}
