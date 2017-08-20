package com.spring.learn.aop.logic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by chengmingwang on 8/20/17.
 */
public class Main {
    @Configuration
    @ComponentScan({"com.spring.learn.aop.aspect","com.spring.learn.aop.logic"}) //要包含窃电Class
    @EnableAspectJAutoProxy
    public static class ConfigAll {
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAll.class);

//        Logic logic = context.getBean(Logic.class);
//        logic.gogogo();

        Logic logic = context.getBean(LogicImpl.class);
        logic.gogogo();


//        Logic logic = new Logic();
//        logic.gogogo();


//        MyAspect myAspect = context.getBean(MyAspect.class);
//        try {
//            myAspect.doBefore(null);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
    }

}
