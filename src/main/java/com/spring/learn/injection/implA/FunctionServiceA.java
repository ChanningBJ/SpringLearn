package com.spring.learn.injection.implA;

import com.spring.learn.injection.base.FunctionService;
import org.springframework.stereotype.Component;

/**
 * Created by chengmingwang on 4/20/17.
 */
@Component
public class FunctionServiceA implements FunctionService {
    public String sayHello(String data){
        System.out.println("Hi "+data);
        return "Hi "+data;
    }
}
