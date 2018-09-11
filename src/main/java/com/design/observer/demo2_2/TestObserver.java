package com.design.observer.demo2_2;

import java.util.Map;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class TestObserver extends AbstractObserver {
    @Override
    public void execute(Map<String, Object> paras) {
        System.out.println("i am here");
        System.out.println("thread name Observer:" + Thread.currentThread().getName());
    }
}

