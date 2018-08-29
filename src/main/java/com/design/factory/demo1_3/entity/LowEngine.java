package com.design.factory.demo1_3.entity;

//差的发动机
public class LowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("转的慢");
    }
    @Override
    public void start() {
        System.out.println("启动慢");
    }
}