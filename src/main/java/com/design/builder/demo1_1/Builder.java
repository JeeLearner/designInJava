package com.design.builder.demo1_1;

/**
 * @Description: 抽象建造者类
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public interface Builder {

    public void buildId();
    public void buildName();
    //产品返还方法
    public Product retrieveResult();
}

