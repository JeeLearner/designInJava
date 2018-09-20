package com.springmvc.support.annotation;

import java.lang.annotation.*;

/**
 *  RequestMapping提供URL地址处理映射
 * @auther: lyd
 * @date: 2018/9/20 14:25
 */
@Documented //JAVADOC
@Target({ElementType.TYPE, ElementType.METHOD}) //作用于方法和类上，实现注入
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {

    public String value();
}
