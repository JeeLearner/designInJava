package com.design.bridge.demo1_1.brand;

import com.design.bridge.demo1_1.Brand;

public class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("戴尔");
    }
}