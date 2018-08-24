package com.design.adapter.demo2;

/**
 * 适配者，提供220V电压
 * @auther: lyd
 * @date: 2018/8/23 17:08
 */
public class Adaptee {

    public int outStream(){
        System.out.println("Adaptee-->out-->220V");
        return 220;
    }
}

