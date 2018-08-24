package com.design.adapter.demo2;

/**
 * 使用者
 * @auther: lyd
 * @date: 2018/8/23 17:40
 */
public class Phone {

    public void inStream(int v) {
       if (v == 220) {
            System.out.println("现在电压再充手机就要爆炸！");
        }
        if (v == 5){
           System.out.println("5v电压可以充电！");
        }
     }
}

