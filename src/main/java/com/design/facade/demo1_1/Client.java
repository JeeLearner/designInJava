package com.design.facade.demo1_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/3
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        //使用了外观模式后
        System.out.println("-----------------------");
        Facade facade = new Facade();
        facade.facade();
    }
}

