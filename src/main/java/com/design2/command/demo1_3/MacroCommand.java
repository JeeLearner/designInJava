package com.design2.command.demo1_3;

import com.design2.command.demo1_3.Command;

/**
 *  系统需要一个代表宏命令的接口，以定义出具体宏命令所需要的接口。
 * @auther: lyd
 * @date: 2018/9/10 16:07
 */
public interface MacroCommand extends Command {
    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    public void add(Command cmd);
    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    public void remove(Command cmd);
}