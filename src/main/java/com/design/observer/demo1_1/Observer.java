package com.design.observer.demo1_1;

/**
 * 抽象观察者:为所有的观察者定义一个接口
 * @auther: lyd
 * @date: 2018/9/11 9:55
 */
public interface Observer {
    //传入主题对象,得到主题对象的通知时更新自己
    void upadte(Subject subject);
}
