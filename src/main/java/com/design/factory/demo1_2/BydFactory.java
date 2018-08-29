package com.design.factory.demo1_2;

import com.design.factory.demo0.Byd;
import com.design.factory.demo0.Car;

//创建比亚迪汽车的工厂
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}

