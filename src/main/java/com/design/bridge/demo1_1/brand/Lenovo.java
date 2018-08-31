package com.design.bridge.demo1_1.brand;

import com.design.bridge.demo1_1.Brand;

public class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("联想");
    }
}