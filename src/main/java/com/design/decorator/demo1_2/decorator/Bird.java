package com.design.decorator.demo1_2.decorator;

import com.design.decorator.demo1_2.Change;
import com.design.decorator.demo1_2.TheGreatestSage;

public class Bird extends Change {
    
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void change() {
        // 代码
        System.out.println("Bird change");
    }
}