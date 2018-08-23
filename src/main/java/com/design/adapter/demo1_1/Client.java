package com.design.adapter.demo1_1;

/**
 * 测试对象适配器模式
 * @auther: lyd
 * @date: 2018/8/20 19:10
 */
public class Client {

    //说话
    public void test1(Target target){
        target.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter();
        c.test1(t);
    }

}

