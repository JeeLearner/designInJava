package com.design.strategy.demo1_1;

/**
 * @Description: 抽象算法接口：定义了所有支持算法的公共接口
 * @Auther: lyd
 * @Date: 2018/8/30
 * @Version:v1.0
 */
public interface Strategy {
    //算法方法:打印商品的价格（不同的实现打不同的折扣）
    public double getPrice(double price);
}

