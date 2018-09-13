package com.jdk8.interface_default;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/12
 * @Version:v1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

class Car implements Vehicle,FourWheeler {
    @Override
    public void print(){
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}

interface Vehicle{
    default void print(){
        System.out.println("我是一辆车!");
    }
    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("我是一辆四轮车!");
    }
}