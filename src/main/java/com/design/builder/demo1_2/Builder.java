package com.design.builder.demo1_2;

import java.util.Date;

/**
 * @Description: 抽象建造者类
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public abstract class Builder {

    protected AutoMessage msg;

    public abstract void buildSubject();
    public abstract void buildBody();

    public void buildTo(String to){
        msg.setTo(to);
    }
    public void buildFrom(String from){
        msg.setFrom(from);
    }
    public void buildSendDate(){
        msg.setSendDate(new Date());
    }

    /**
     * 邮件产品完成后，用此方法发送邮件
     * 此方法相当于产品返还方法
     */
    public void sendMessage(){
        msg.send();
    }

}

