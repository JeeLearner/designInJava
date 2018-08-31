package com.design.decorator.demo1_2.decorator;

import com.design.decorator.demo1_2.Change;
import com.design.decorator.demo1_2.TheGreatestSage;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class Fish extends Change {

    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void change() {
        // 代码
        System.out.println("Fish change");
    }
}

