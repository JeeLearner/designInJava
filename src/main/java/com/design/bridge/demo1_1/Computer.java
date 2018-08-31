package com.design.bridge.demo1_1;

/**
 * 电脑类型维度：这里需要使用一个类，不能用接口。
 *      因为这里还需要持有品牌（Brand）的一个引用
 */
public class Computer {

    private Brand brand;//类型维度里持有品牌维度的引用

    public Computer(Brand brand){
        super();
        this.brand = brand;
    }

    public void sale(){
        brand.sale();//具体某品牌的销售
    }

}

