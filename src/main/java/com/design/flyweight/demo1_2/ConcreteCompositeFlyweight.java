package com.design.flyweight.demo1_2;

import com.design.flyweight.demo1_1.Coordinate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/7
 * @Version:v1.0
 */
public class ConcreteCompositeFlyweight implements ChessFlyWeight{

    private Map<String,ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(String color, ChessFlyWeight chess) {
        map.put(color, chess);
    }


    @Override
    public void setColor(String c) {

    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void display(Coordinate c) {
        ChessFlyWeight chess = null;
        for (Object o : map.keySet()) {
            chess = map.get(o);
            chess.display(c);
        }
    }
}

