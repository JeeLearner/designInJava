package com.design.adapter.spring_demo1.adaptee;

/**
 * controller实现之一 httpController
 * @auther: lyd
 * @date: 2018/8/23 17:57
 */
public class HttpController implements Controller {

    public void doHttpHandler(){
        System.out.println("http...");
    }
}

