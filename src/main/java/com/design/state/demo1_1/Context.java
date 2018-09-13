package com.design.state.demo1_1;

/**
 * @Description: 定义重要的部分，Context上下文。这个对象中定义了当前状态
 *      上下文对象：用来引用一个State的实例，维护各个状态
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class Context {
    private State state;//当前状态

    public void setState(State state) {
        this.state = state;
    }

    public void request(String parameter){
        System.out.print("修改状态：");
        state.handler(parameter);
    }
}

