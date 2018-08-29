package com.design.factory.demo1_2;

import com.design.factory.demo0.Audi;
import com.design.factory.demo0.Car;

//创建奥迪的工厂
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}