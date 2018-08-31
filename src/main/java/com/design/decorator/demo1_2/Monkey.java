package com.design.decorator.demo1_2;

/**
 * @Description: 具体构件角色“大圣本尊”猢狲类
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class Monkey implements TheGreatestSage {
    @Override
    public void change() {
        //代码
        System.out.println("Monkey change....");
    }
}

