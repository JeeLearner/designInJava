package com.design.observer.demo1_1;

/**
 * @Description: 具体的主题对象
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class ConcreteSubject extends Subject {

    private int state;//默认状态为0
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        //当修改了主题对象状态时，通知所有观察者
        this.notifyAllObserver();//通知所有观察者
    }
}

