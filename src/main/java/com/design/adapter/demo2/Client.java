package com.design.adapter.demo2;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/23
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("适配器模式：--------------------------");
        Target target = new Adapter();
        Phone p1 = new Phone();
        p1.inStream(target.outStream());

        System.out.println("非适配器模式：--------------------------");
        Adaptee adaptee = new Adaptee();
        Phone p2 = new Phone();
        p1.inStream(adaptee.outStream());

    }
}

