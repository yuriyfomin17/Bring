package com.nimofy.applicationContext.exceptions;

public class NoSuchBeanException extends RuntimeException {
    public NoSuchBeanException() {
        super("NO_SUCH_BEAN_EXCEPTION");
    }
}
