package com.design.decorator.demo1_1.decorator;

import com.design.decorator.demo1_1.ICar;
import com.design.decorator.demo1_1.SuperCar;

public class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        swim();//在原有移动的基础上，装饰了一个swim的功能
    }

    //这里就是新增的功能
    public void swim(){
        System.out.println("---水里游");
    }
}