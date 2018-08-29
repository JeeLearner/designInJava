package com.design.factory.demo1_3;

import com.design.factory.demo1_3.entity.Engine;
import com.design.factory.demo1_3.entity.LuxuryEngine;
import com.design.factory.demo1_3.entity.LuxurySeat;
import com.design.factory.demo1_3.entity.Seat;

/**
 *  高端汽车制造工厂
 */
public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }
    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }
}
