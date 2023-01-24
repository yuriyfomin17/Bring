package com.nimofy.applicationContextTest.testBeanAutowireNoUniqueBeanException;

import com.nimofy.applicationContext.annotations.Autowire;
import com.nimofy.applicationContext.annotations.Bean;

@Bean
public class SameBean1 implements SameBeanInterface {
    @Autowire
    SameBeanInterface nonUniqueBean;

    public SameBean1() {
    }
}
