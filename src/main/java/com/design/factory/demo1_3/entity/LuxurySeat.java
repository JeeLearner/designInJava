package com.design.factory.demo1_3.entity;

//好的座椅
public class LuxurySeat implements Seat{

    @Override
    public void feel() {
        System.out.println("好座椅舒服");
    }
}