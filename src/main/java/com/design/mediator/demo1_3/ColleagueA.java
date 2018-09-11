package com.design.mediator.demo1_3;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class ColleagueA extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator mediator) {
        super.number = number;
        mediator.AaffectB();
    }


}

