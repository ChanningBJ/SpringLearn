package com.spring.learn.injection.implB;

import com.spring.learn.injection.base.FunctionService;
import org.springframework.stereotype.Component;

/**
 * Created by chengmingwang on 4/20/17.
 */
@Component
public class FunctionServiceB  implements FunctionService {
    public String sayHello(String data){
        System.out.println("Hello "+data);
        return "Hello "+data;
    }
}
