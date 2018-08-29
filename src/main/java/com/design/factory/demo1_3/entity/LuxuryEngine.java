package com.design.factory.demo1_3.entity;

//好的发动机
public class LuxuryEngine implements Engine{
    @Override
    public void run() {
        System.out.println("好发动机转的快");
    }
    @Override
    public void start() {
        System.out.println("启动快，自动启停");
    }
}