package com.design.singleton.demo1_1;

/**
 * @Description: 双重检索单例模式
 *  将锁加在判断实例为空的地方，不加在方法上
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class DoubleSynchronizedSingleton {

    private volatile static DoubleSynchronizedSingleton instance = null;

    private DoubleSynchronizedSingleton(){

    }

    /**
     * 3、对外提供获取实例的方法
     * 但是同步的时候将锁放到第一次获取实例的时候，这样的好处就是只有第一次会同步。效率高
     * @return
     */
    public static DoubleSynchronizedSingleton getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (instance == null) {
            //同步块，线程安全的创建实例
            synchronized (DoubleSynchronizedSingleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new DoubleSynchronizedSingleton();
                }
            }
        }
        return instance;
    }


}

