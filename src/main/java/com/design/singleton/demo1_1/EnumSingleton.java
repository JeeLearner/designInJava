package com.design.singleton.demo1_1;

/**
 * @Description: 枚举实现单例模式（枚举本身就是单例）
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public enum EnumSingleton {

    /**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */
    uniqueInstance;

    public void singletonOperation(){
        //功能处理
    }

}

