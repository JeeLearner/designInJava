package com.design2.command.demo1_1;

/**
 * 具体命令类
 *  具体命令类中需要持有真正执行命令的那个对象。
 * @auther: lyd
 * @date: 2018/9/10 15:33
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //调用接收者执行命令的方法
        receiver.action();
    }
}

