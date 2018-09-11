package com.design.observer.demo2_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        String[] locations = {"observer_listener.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(locations);

        EventManager eventManager = (EventManager)ctx.getBean("eventManager");
        System.out.println("thread name main:" + Thread.currentThread().getName());
        eventManager.dispatchEvent("event1", null);
    }
}

