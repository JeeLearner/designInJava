package com.design.builder.demo1_1;

/**
 * @Description: 具体建造者类
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildId() {
        product.setId("1");
    }

    @Override
    public void buildName() {
        product.setName("测试");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}

