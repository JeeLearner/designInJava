package com.design.mediator.demo1_2;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class ColleagueA extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractColleague coll) {
        super.number = number;
        coll.setNumber(number*100);
    }


}

