package com.design.flyweight.demo1_1;

/**
 * @Description: 非共享享元类：
 *      不能被共享的子类可以设计为非共享享元类
 * @Auther: lyd
 * @Date: 2018/9/6
 * @Version:v1.0
 */
public class Coordinate {
    private int x,y; //坐标位置
    public Coordinate(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

