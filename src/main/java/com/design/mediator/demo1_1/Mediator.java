package com.design.mediator.demo1_1;

/**
 * 抽象中介者
 * @auther: lyd
 * @date: 2018/9/11 15:58
 */
public interface Mediator {

    void register(String dname, Department department);//将具体的同事类注册到中介者中，让中介者知道所有的同事。以便进行交互
    void command(String dname);//通过部门名称，发出命令
}
