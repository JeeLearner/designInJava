package com.design.factory.demo1_3;

import com.design.factory.demo1_3.entity.Engine;
import com.design.factory.demo1_3.entity.LowEngine;
import com.design.factory.demo1_3.entity.LowSeat;
import com.design.factory.demo1_3.entity.Seat;

/**
 *  低端汽车制造工厂
 */
public class LowCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }
    @Override
    public Seat createSeat() {
        return new LowSeat();
    }
}
