package com.design.builder.demo1_1;

/**
 * @Description:  导演者类
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class Director {

    /**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入建造器对象
     * @param builder 建造器对象
     */
    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct(){
        builder.buildId();
        builder.buildName();
    }
}

