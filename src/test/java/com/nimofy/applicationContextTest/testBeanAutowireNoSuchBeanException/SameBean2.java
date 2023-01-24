package com.nimofy.applicationContextTest.testBeanAutowireNoSuchBeanException;

import com.nimofy.applicationContext.annotations.Bean;

@Bean
public class SameBean2 implements SameBeanInterface {
    public SameBean2() {
    }
}
