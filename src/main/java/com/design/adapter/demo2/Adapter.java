package com.design.adapter.demo2;


 /**
  * 适配器 ， 用于转化电压220V-->5V
  * @auther: lyd
  * @date: 2018/8/23 17:12
  */
public class Adapter extends Adaptee implements Target{

    @Override
    public int outStream() {
        //转化过程.......
        System.out.println("对"+super.outStream()+"V进行转换....");
        System.out.println("现在是5V");
        return 5;
     }
 }

