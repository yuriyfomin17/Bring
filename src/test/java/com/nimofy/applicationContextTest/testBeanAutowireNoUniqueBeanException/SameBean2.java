package com.nimofy.applicationContextTest.testBeanAutowireNoUniqueBeanException;

import com.nimofy.applicationContext.annotations.Bean;

@Bean
public class SameBean2 implements SameBeanInterface {
    public SameBean2() {
    }
}
