package com.design.factory.demo1_1;

import com.design.factory.demo0.Car;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class TestSimpleFactoryCar {

    public static void main(String[] args) {
        //创建汽车
        Car audi = CarFactory.createCar("audi");//创建者
        Car byd = CarFactory.createCar("byd");
        audi.run();
        byd.run();
    }
}

