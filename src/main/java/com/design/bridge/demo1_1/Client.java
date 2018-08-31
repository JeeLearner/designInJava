package com.design.bridge.demo1_1;

import com.design.bridge.demo1_1.brand.Lenovo;
import com.design.bridge.demo1_1.computer.Laptop;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        //销售联想的笔记本
        Computer c = new Laptop(new Lenovo());
        c.sale();
    }
}

