package com.design.decorator.demo1_1;

/**
 * 装饰抽象类Decorator：SuperCar这里需要持有一个真实对象的引用，也就是Car对象
 * @auther: lyd
 * @date: 2018/8/31 15:41
 */
public class SuperCar implements ICar{

    protected ICar car;//持有一个真实对象的引用

    //构造的时候传参
    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();//这里调用真实对象的移动方法
    }
}
