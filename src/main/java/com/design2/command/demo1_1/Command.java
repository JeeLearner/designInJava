package com.design2.command.demo1_1;

/**
 *
 * 抽象命令类：抽象的命令，可以根据不同类型的命令写出不同的实现
 * @auther: lyd
 * @date: 2018/9/10 15:32
 */
public interface Command {
    //调用命令
    void execute();
}

