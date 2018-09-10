package com.design.prototype.demo2_2;

/**
 * 抽象原型角色
 * @auther: lyd
 * @date: 2018/9/10 10:54
 */
public interface Prototype{
    public Prototype clone();
    public String getName();
    public void setName(String name);
}