package com.design.state.demo1_1;

//具体状态：已预定
public class BookedState implements State{
    @Override
    public void handler(String parameter) {
        System.out.println("房间已被预定！参数：" + parameter);
    }
}