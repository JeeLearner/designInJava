package com.springmvc.support.annotation;

import java.lang.annotation.*;

/**
 *  Qualifier提供依赖注入
 * @auther: lyd
 * @date: 2018/9/20 14:25
 */
@Documented //JAVADOC
@Target(ElementType.FIELD) //作用于字段上，实现注入
@Retention(RetentionPolicy.RUNTIME)
public @interface Qualifier {

    public String value() default "";
}
