package com.design.strategy.demo1_1.r;

import com.design.strategy.demo1_1.Strategy;

//具体的算法：普通会员：打8折
public class RegisterVip implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("普通会员：打8折");
        return price*0.8;
    }
}