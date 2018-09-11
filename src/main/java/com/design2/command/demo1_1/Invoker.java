package com.design2.command.demo1_1;

/**
 * 定义命令的发起者了，发起者需要持有一个命令对象。以便来发起命令。
 * @auther: lyd
 * @date: 2018/9/10 15:38
 */
public class Invoker {
    private Command command;//持有命令对象的引用
    public Invoker(Command command) {
        super();
        this.command = command;
    }
    public void call(){
        //请求者调用命令对象执行命令的那个execute方法
        command.execute();
    }
}

