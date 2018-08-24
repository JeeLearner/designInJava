package com.design.adapter.spring_demo1.adaptee;

/**
 * controller实现之一 simpleController
 * @auther: lyd
 * @date: 2018/8/23 17:57
 */
public class SimpleController implements Controller {

    public void doSimpleHandler(){
        System.out.println("simple...");
    }
}

