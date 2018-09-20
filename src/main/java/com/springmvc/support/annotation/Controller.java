package com.springmvc.support.annotation;

import java.lang.annotation.*;

/**
 * 控制层注解
 * @auther: lyd
 * @date: 2018/9/20 14:25
 */
@Documented //JAVADOC
@Target(ElementType.TYPE) //作用于类上
@Retention(RetentionPolicy.RUNTIME) //限制Annotation的生命周期，我这里自定义的注解显然需要运行时保留
public @interface Controller {

    /**
     * 作用于该类上的注解有一个VALUE属性，说白了就是Controller名称
     */
    public String value();
}
