package com.design.mediator.demo1_2;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public abstract class AbstractColleague {
    protected int number;

    //抽象方法，修改数字时同时修改关联对象
    public abstract void setNumber(int number, AbstractColleague coll);

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
}



