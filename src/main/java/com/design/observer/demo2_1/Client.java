package com.design.observer.demo2_1;

import com.design.factory.demo2_1.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {
        /*ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring/application-database.xml");
        MyPublisher myPubisher=(MyPublisher) context.getBean("myPublisher");
        myPubisher.publishEvent(new MyEvent("1"));*/

        /** 打印台
        my Event

        into My Publisher's method

        into My Listener
        hello spring event[MyEvent]
        into My second Listener
        hello spring event[MyEvent]
        */
    }
}

