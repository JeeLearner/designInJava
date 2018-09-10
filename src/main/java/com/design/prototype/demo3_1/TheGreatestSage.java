package com.design.prototype.demo3_1;

import java.io.IOException;

/**
 * @Description: 孙大圣本人用TheGreatestSage类代表
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class TheGreatestSage {
    private Monkey monkey = new Monkey();

    public void change() throws IOException, ClassNotFoundException {
        //克隆大圣本尊
        //Monkey copyMonkey = (Monkey)monkey.clone();
        Monkey copyMonkey = (Monkey)monkey.deepClone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate()); //大圣本尊的生日是：Mon Sep 10 11:31:45 CST 2018
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthDate()); //大圣本尊的生日是：Mon Sep 10 11:31:45 CST 2018
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey)); //false
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff())); //true   //false
    }

    public static void main(String[]args) throws IOException, ClassNotFoundException {
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}

