package com.design.builder.demo1_2;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");
    }

}

