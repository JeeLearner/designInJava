package com.design.prototype.demo1_2;

import java.util.Date;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1274397294739L);
        Sheep s1 = new Sheep("原型羊",date);
        Sheep s2 = (Sheep)s1.clone();
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println("原日期："+s1.getBirthday());
        date.setTime(34732834827389L);//改变原有date的值
        System.out.println("改变后的日期："+date.toString());

        //克隆羊的信息
        System.out.println("---------------------------------");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());//克隆了之后把原来的日期改变后，克隆的对象2的属性则不会被影响。
    }
}

