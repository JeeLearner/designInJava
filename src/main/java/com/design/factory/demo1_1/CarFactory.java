package com.design.factory.demo1_1;

import com.design.factory.demo0.Audi;
import com.design.factory.demo0.Byd;
import com.design.factory.demo0.Car;

/**
 * @Description: 使用了简单工厂模式后：可以创建一个工厂类，该类中提供一个创建汽车的工厂（方法）
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class CarFactory {

    /**
     * 创建汽车
     * @param type
     * @return
     */
    public static Car createCar(String type){
        //该方法还会有问题，假如以后有很多汽车都需要工厂来创建。则又得修改源代码，违反了OCP开闭原则
        if ("audi".equals(type)) {
            return new Audi();
        }else if ("byd".equals(type)) {
            return new Byd();
        }else{
            return null;
        }
    }
}

