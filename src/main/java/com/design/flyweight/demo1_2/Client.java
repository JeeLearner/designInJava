package com.design.flyweight.demo1_2;

import com.design.flyweight.demo1_1.Coordinate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/7
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("黑");
        colors.add("白");
        ChessFlyWeightFactory chessFlyWeightFactory = new ChessFlyWeightFactory();
        ChessFlyWeight chess1 = chessFlyWeightFactory.factory(colors);
        ChessFlyWeight chess2 = chessFlyWeightFactory.factory(colors);
        chess1.display(new Coordinate(10, 10)); //黑1在10,10的位置
        //棋子颜色：黑
        //棋子位置：(10,10)
        //棋子颜色：白
        //棋子位置：(10,10)

        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (chess1 == chess2)); //false

        String color = "红";
        ChessFlyWeight chess11 = chessFlyWeightFactory.getChess(color);
        ChessFlyWeight chess12 = chessFlyWeightFactory.getChess(color);
        System.out.println("单纯享元模式是否可以共享对象：" + (chess11 == chess12)); //true
    }
}

