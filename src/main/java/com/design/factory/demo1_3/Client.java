package com.design.factory.demo1_3;

import com.design.factory.demo1_3.entity.Engine;
import com.design.factory.demo1_3.entity.Seat;

import java.util.Calendar;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        //想要好车
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();//创建高端发动机
        engine.run();
        engine.start();

        //想要差一点的车
        CarFactory factory2 = new LowCarFactory();
        Engine e2= factory2.createEngine();
        Seat s2 = factory2.createSeat();
        e2.run();
        e2.start();
        //以后想要中等车的话可以增加相应中等配件的接口

        Calendar.getInstance();
    }
}

