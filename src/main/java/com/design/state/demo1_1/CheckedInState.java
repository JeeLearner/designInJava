package com.design.state.demo1_1;

//具体状态：已入住
public class CheckedInState implements State{
    @Override
    public void handler(String parameter) {
        System.out.println("房间已入住！参数：" + parameter);
    }
}