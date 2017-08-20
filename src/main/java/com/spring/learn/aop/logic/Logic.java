package com.spring.learn.aop.logic;

import com.spring.learn.aop.aspect.CutPoint;
import org.springframework.stereotype.Component;

/**
 * Created by chengmingwang on 8/20/17.
 */
@Component
public class Logic {
    public void dothings(){
        System.out.println("do things");
    }

    @CutPoint
    public void gogogo(){
        System.out.println("xssssxxx");
    }
}
