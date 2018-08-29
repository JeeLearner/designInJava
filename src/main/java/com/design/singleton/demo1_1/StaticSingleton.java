package com.design.singleton.demo1_1;

/**
 * @Description: 静态内部类式
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class StaticSingleton {

    /**
     * 1、私有化构造器
     */
    private StaticSingleton(){

    }

    /**
     * 2、声明一个静态内部类,在静态内部类内部提供一个外部类的实例（常量，不可改变）
     * 初始化StaticSingleton的时候不会初始化SingletonHolder，实现了延时加载。并且线程安全
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全 该实例只读，不管谁都不能修改
         */
        private final static StaticSingleton instance = new StaticSingleton();
    }

    /**
     * 3、对外提供一个获取实例的方法：直接返回静态内部类中的那个常量实例
     * 调用的时候没有同步等待，所以效率也高
     * @return
     */
    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }


}

