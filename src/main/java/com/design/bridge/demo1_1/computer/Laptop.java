package com.design.bridge.demo1_1.computer;

import com.design.bridge.demo1_1.Brand;
import com.design.bridge.demo1_1.Computer;

public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("笔记本");
    }
}