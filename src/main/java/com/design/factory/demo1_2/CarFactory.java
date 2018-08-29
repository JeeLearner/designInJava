package com.design.factory.demo1_2;

import com.design.factory.demo0.Car;

//工厂接口
public interface CarFactory {
    //创建汽车方法
    Car createCar();
}