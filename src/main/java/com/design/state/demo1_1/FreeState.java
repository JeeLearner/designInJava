package com.design.state.demo1_1;

//具体状态：空闲
public class FreeState implements State{
    @Override
    public void handler(String parameter) {
        System.out.println("房间空闲中，可以预定！参数：" + parameter);
    }
}