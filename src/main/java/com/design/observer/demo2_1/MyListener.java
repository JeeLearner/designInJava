package com.design.observer.demo2_1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Description: 2.建立监听类
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class MyListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof MyEvent) {
            System.out.println("into My Listener");
            MyEvent myEvent=(MyEvent)event;
            myEvent.print();
        }
    }
}

