package com.nimofy.applicationContextTest.testBeanAutowireNoSuchBeanException;

import com.nimofy.applicationContext.annotations.Autowire;
import com.nimofy.applicationContext.annotations.Bean;

import java.lang.reflect.Field;

@Bean
public class SameBean1 implements SameBeanInterface {
    @Autowire
    Field nonExistentBean;



    public SameBean1() {
    }
}
