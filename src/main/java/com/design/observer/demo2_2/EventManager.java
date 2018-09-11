package com.design.observer.demo2_2;

import java.util.List;
import java.util.Map;

/**
 * @Description: 事件管理类
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class EventManager {
    private Map<String, List<Observer>> events;

    public void dispatchEvent(String eventName, Map<String, Object> paras) {
        if (events == null || events.isEmpty()) {
            return;
        }
        List<Observer> observers = events.get(eventName);
        for (Observer observer : observers) {
            if (observer.isAsyn()) {
                EventManagerThread eventManagerThread = new EventManagerThread(observer, paras);
                Thread thread = new Thread(eventManagerThread);
                thread.start();
            } else {
                observer.execute(paras);
            }
        }

    }

    public void setEvents(Map<String, List<Observer>> events) {
        this.events = events;
    }

}

class EventManagerThread implements Runnable {

    private Observer observer;
    private Map<String, Object> paras;

    public EventManagerThread(Observer observer, Map<String, Object> paras) {
        this.observer = observer;
        this.paras = paras;
    }

    @Override
    public void run() {
        this.observer.execute(paras);
    }
}

