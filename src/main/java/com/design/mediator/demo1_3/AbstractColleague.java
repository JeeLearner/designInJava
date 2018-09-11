package com.design.mediator.demo1_3;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public abstract class AbstractColleague {
    protected int number;

    //注意这里的参数不再是同事类，而是一个中介者
    public abstract void setNumber(int number, AbstractMediator mediator);

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
}



