package com.design.flyweight.demo1_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元工厂
 * FlyweightFactory（享元工厂类）：创建并管理享元对象，享元池一般设计成键值对
 */
public class ChessFlyWeightFactory {

    /**
     * 复合享元工厂方法
     */
    public ChessFlyWeight factory(List<String> colors){
        ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();
        for (String color : colors) {
            compositeFlyweight.add(color, this.getChess(color));
        }
        return compositeFlyweight;
    }




    //享元池：存放享元对象
    private static Map<String, ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();

    //提供一个享元工厂:创建和管理棋子
    public ChessFlyWeight getChess(String color){
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight chess = new ConcreteFlyWeight(color);
            map.put(color, chess);
            return chess;
        }
    }
}

