package com.spring.learn.aop.aspect;

import java.lang.annotation.*;

/**
 * Created by chengmingwang on 8/20/17.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CutPoint {
}
