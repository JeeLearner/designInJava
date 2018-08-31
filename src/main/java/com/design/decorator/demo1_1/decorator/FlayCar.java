package com.design.decorator.demo1_1.decorator;

import com.design.decorator.demo1_1.ICar;
import com.design.decorator.demo1_1.SuperCar;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class FlayCar extends SuperCar {

    public FlayCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        flay();//在原有移动的基础上，装饰了一个fly的功能
    }

    //这里就是新增的功能
    public void flay(){
        System.out.println("---天上飞");
    }
}

