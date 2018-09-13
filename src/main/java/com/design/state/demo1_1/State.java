package com.design.state.demo1_1;

/**
 *  定义一个State接口，使用抽象类也行
 *      抽象状态类
 * @auther: lyd
 * @date: 2018/9/13 15:20
 */
public interface State {
    void handler(String parameter);
}
