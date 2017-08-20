package com.spring.learn.injection.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chengmingwang on 4/20/17.
 */
@Service
public class ServiceHub {

    @Autowired
    FunctionService[] functionService;

    public String doSay(String data){
        StringBuilder bd = new StringBuilder();
        for(FunctionService service: functionService){
            bd.append(service.sayHello(data));
        }
        return bd.toString();
    }
}
