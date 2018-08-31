package com.design.decorator.demo1_2;

import com.design.decorator.demo1_2.decorator.Bird;
import com.design.decorator.demo1_2.decorator.Fish;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        //第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        //TheGreatestSage fish2 = new Fish(new Bird(sage));

        fish.change();
    }
}

