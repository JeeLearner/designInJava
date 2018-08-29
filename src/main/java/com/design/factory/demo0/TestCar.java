package com.design.factory.demo0;

//汽车测试类
public class TestCar {//调用者
    public static void main(String[] args) {
        Car c1 = new Byd();
        Car c2 = new Audi();    
        c1.run();
        c2.run();
        //未使用工厂模式的时候，调用者会依赖很多类。违反了开闭原则
    }
}