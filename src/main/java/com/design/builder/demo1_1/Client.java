package com.design.builder.demo1_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getId());
        System.out.println(product.getName());
    }

}

