package com.design.prototype.demo2_2;

/**
 * 具体原型角色
 * @auther: lyd
 * @date: 2018/9/10 10:55
 */
public class ConcretePrototype1 implements Prototype {

    private String name;

    @Override
    public Prototype clone(){
        ConcretePrototype1 prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }
    @Override
    public String toString(){
        return "Now in Prototype1 , name = " + this.name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}