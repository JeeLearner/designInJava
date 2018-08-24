package com.design.adapter.spring_demo1.adapter;

import com.design.adapter.spring_demo1.adaptee.HttpController;
import com.design.adapter.spring_demo1.target.HandlerAdapter;

/**
 * 适配器类
 * @auther: lyd
 * @date: 2018/8/24 9:37
 */
public class HttpHandlerAdapter implements HandlerAdapter{


    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}

