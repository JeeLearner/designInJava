package com.design.strategy.demo1_1.r;

import com.design.strategy.demo1_1.Strategy;

/**
 * @Description: 具体的算法:普通用户，不打折
 * @Auther: lyd
 * @Date: 2018/8/30
 * @Version:v1.0
 */
public class GeneralUser implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("普通用户，不打折");
        return price;
    }
}

