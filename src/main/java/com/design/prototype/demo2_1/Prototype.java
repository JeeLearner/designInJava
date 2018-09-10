package com.design.prototype.demo2_1;

/**
 * 抽象原型角色
 * @auther: lyd
 * @date: 2018/9/10 10:29
 */
public interface Prototype{
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Object clone();
}