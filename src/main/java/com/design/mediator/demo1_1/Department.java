package com.design.mediator.demo1_1;

/**
 * 抽象同事类  --部门
 * @auther: lyd
 * @date: 2018/9/11 15:59
 */
public interface Department {

    void selfAction();//做本部门的事
    void outAction();//向总经理发出申请
}
