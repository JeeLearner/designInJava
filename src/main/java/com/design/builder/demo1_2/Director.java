package com.design.builder.demo1_2;

/**
 * 导演者Director，这个类提供一个construct()方法，
 * 此方法调用建造者的建造方法，包括buildTo()、buildFrom()、buildSubject()、buildBody()、buildSendDate()等，
 * 从而一部分一部分地建造出产品对象，既AutoMessage对象。
 * @auther: lyd
 * @date: 2018/8/24 13:51
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各零件的建造方法
     */
    public void construct(String toAddress , String fromAddress){
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.sendMessage();
    }

}

