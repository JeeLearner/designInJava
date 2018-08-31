package com.design.bridge.demo1_1.computer;

import com.design.bridge.demo1_1.Brand;
import com.design.bridge.demo1_1.Computer;

public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("台式机");
    }
}