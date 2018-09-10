package com.design.prototype.demo2_1;

/**
 * 具体原型角色
 * @auther: lyd
 * @date: 2018/9/10 10:29
 */
public class ConcretePrototype1 implements Prototype {

    @Override
    public Prototype clone(){
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}