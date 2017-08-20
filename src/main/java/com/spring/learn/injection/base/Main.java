package com.spring.learn.injection.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chengmingwang on 4/20/17.
 */
public class Main {

    @Configuration
    @ComponentScan({"com.spring.learn.injection.implB","com.spring.learn.injection.implA"})
    public static class ConfigAll implements Config{
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAll.class,Config.class);

        ServiceHub serviceHub = context.getBean(ServiceHub.class);
        serviceHub.doSay("hahahahah");
    }
}
