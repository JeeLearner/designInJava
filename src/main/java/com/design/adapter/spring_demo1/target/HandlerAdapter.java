package com.design.adapter.spring_demo1.target;

/**
 *  适配器接口Target
 * @auther: lyd
 * @date: 2018/8/23 17:55
 */
public interface HandlerAdapter {

    public boolean supports(Object handler);
    public void handle(Object handler);
}
