package com.design.decorator.demo1_1;

import com.design.decorator.demo1_1.decorator.FlayCar;
import com.design.decorator.demo1_1.decorator.WaterCar;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("--------增加飞行功能-------");
        FlayCar flayCar = new FlayCar(car);
        flayCar.move();

        System.out.println("--------增加潜水功能-------");
        WaterCar waterCar = new WaterCar(car);//将真实对象传入装饰对象中
        waterCar.move();//这里就是增加了潜水功能后的装饰

    }
}

