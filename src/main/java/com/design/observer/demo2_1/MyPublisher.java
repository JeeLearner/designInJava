package com.design.observer.demo2_1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;

/**
 * @Description: 3.创建一个发布事件的类
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class MyPublisher implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public void publishEvent(ApplicationEvent event){
        System.out.println("into My Publisher's method");
        applicationContext.publishEvent(event);
    }

}

