package com.design.strategy.demo1_1;

/**
 * @Description: 上下文：用来维护不同对象的不同折扣
 * @Auther: lyd
 * @Date: 2018/8/30
 * @Version:v1.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        super();
        this.strategy = strategy;
    }

    //打印价钱
    public void printPrice(double price){
        System.out.println("应付金额："+Math.round(strategy.getPrice(price)));
    }
}

