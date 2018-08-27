package com.design.builder.demo2_1;
/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Square square = new Square.Builder()
                .setColor(20)
                .setBorderSize(12)
                .setBorderColor(121)
                .build();
        square.getColor();
    }
}

