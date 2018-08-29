package com.design.factory.demo1_3.entity;

//一般座椅
public class LowSeat implements Seat{

    @Override
    public void feel() {
        System.out.println("一般座椅不太舒服");
    }
}