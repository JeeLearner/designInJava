package com.design2.command.demo1_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        //通过请求者（invoker）调用命令对象（command），命令对象中调用了命令具体执行者（Receiver）
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}

