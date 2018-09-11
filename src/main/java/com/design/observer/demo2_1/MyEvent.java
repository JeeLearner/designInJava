package com.design.observer.demo2_1;

import org.springframework.context.ApplicationEvent;

/**
 * @Description: 1.建立事件类
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
        System.out.println("my Event");
    }

    public void print(){
        System.out.println("hello spring event[MyEvent]");
    }
}

