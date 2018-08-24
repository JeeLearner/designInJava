package com.design.adapter.spring_demo1.adapter;

import com.design.adapter.spring_demo1.adaptee.SimpleController;
import com.design.adapter.spring_demo1.target.HandlerAdapter;

/**
 * @Description: 适配器类
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class SimpleHandlerAdapter implements HandlerAdapter {

    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}

