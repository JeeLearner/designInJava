package com.design.singleton.demo1_1;

/**
 * @Description:
 *  饿汉式单例：所谓饿汉式，就是比较饿。当类一加载的时候就直接new了一个静态实例。
 *   不管后面有没有用到该实例
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class EagerSingleton {

    /**
     * 1、提供一个静态变量。
     * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能
     */
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 2、私有化构造器:外部是不能直接new该对象的
     */
    private EagerSingleton(){

    }
    /**
     * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
     * @return
     */
    public static EagerSingleton getInstance(){
        return instance;
    }

}

