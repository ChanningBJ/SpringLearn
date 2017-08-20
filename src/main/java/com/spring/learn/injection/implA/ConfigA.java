package com.spring.learn.injection.implA;

import com.spring.learn.injection.base.Config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chengmingwang on 4/20/17.
 */

@Configuration
@ComponentScan(
        "com.spring.learn.injection.implA"
)
public class ConfigA implements Config {
}
