package com.springmvc.support.annotation;

import java.lang.annotation.*;

/**
 * Service层注解
 * @auther: lyd
 * @date: 2018/9/20 14:25
 */
@Documented //JAVADOC
@Target(ElementType.TYPE) //作用于类上
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

    public String value();
}
