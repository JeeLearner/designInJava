package com.design.singleton.demo1_2;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Description: 静态内部类式
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class StaticSingleton2 implements Serializable{

    private static StaticSingleton2 instance = new StaticSingleton2();

    /**
     * 1、私有化构造器
     */
    private StaticSingleton2(){

    }

    /**
     * 3、对外提供一个获取实例的方法：直接返回静态内部类中的那个常量实例
     * 调用的时候没有同步等待，所以效率也高
     * @return
     */
    public static StaticSingleton2 getInstance(){
        return instance;
    }

    /**
     * 反序列化时，如果定义了readResolve()则直接返回该方法指定的实例。不会再单独创建新对象！
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}

