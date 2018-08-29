package com.design.singleton.demo1_1;

/**
 * @Description:
 *  懒汉式单例：比较懒，一开始不初始化实例。
 *  等什么时候用就什么时候初始化.避免资源浪费
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class LazySingleton {

    /**
     * 1、声明一个静态实例，不给它初始化。等什么时候用就什么时候初始化。节省资源
     */
    private static LazySingleton instance = null;

    /**
     * 2、依然私有化构造器，对外不让new
     */
    private LazySingleton(){

    }

    /**
     * 3、对外提供一个获取实例的方法，因为静态属性没有实例化。
     * 假如高并发的时候，有可能会同时调用该方法。造成new出多个实例。所以需要加上同步synchronized，因此调用效率不高
     * 在方法上加同步，是整个方法都同步。效率不高
     * @return
     */
    public static synchronized LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}

