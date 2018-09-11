package com.design.observer.demo1_2;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class ConcreteObserver implements Observer {
    private int state;//具体观察者中的状态和目标对象的状态保持一致

    @Override
    public void update(Observable o, Object arg) {
        state = ((ConcreteSubject)o).getState();
    }

    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
}

