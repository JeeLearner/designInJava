package com.design.decorator.demo1_1;

/**
 * 定义一个具体真实的对象ConcreteComponent：
 *      这里是Car，就是具体的汽车，未装饰的汽车
 * @auther: lyd
 * @date: 2018/8/31 15:47
 */
public class Car implements ICar{
    @Override
    public void move() {
        System.out.println("汽车移动");
    }
}
