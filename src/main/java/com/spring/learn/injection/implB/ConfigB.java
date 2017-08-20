package com.spring.learn.injection.implB;

import com.spring.learn.injection.base.Config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chengmingwang on 4/20/17.
 */


@Configuration
@ComponentScan("com.spring.learn.injection.implB")
public class ConfigB implements Config{
}
