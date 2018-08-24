package com.design.builder.demo1_2;

/**
 * @Description: 具体建造者
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢迎标题");
    }

    @Override
    public void buildBody() {
        msg.setBody("欢迎内容");
    }
}

