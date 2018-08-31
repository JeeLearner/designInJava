package com.design.decorator.demo1_2;

/**
 * @Description: 抽象装饰角色“七十二变”
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class Change implements TheGreatestSage {

    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }

    @Override
    public void change() {
        //代码
        sage.change();
    }
}

