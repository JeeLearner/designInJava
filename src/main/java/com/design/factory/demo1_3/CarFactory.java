package com.design.factory.demo1_3;

import com.design.factory.demo1_3.entity.Engine;
import com.design.factory.demo1_3.entity.Seat;

/**
 *  汽车总工厂，可以创建轮胎，座椅，发动机
 *      用来生产各种类型的汽车。所有的汽车都需要依赖此工厂来生产汽车。
 */
public interface CarFactory {
    Engine createEngine();//创建发动机
    Seat createSeat();//创建座椅
}
