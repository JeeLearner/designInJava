package com.design.singleton.demo1_3;

import com.design.singleton.demo1_1.EnumSingleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试几种单例模式的速度
 */
public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadNum = 10;//10个线程
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = EnumSingleton.uniqueInstance;
                    }
                    countDownLatch.countDown();//计数器-1
                }
            }).start();
        }

        countDownLatch.await();//main线程阻塞
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));

        /**
         * 结果（毫秒）:
         * Singleton1（饿汉式）耗时：5
         * Singleton2（懒汉式）耗时：227
         * Singleton3（双重检索式）耗时：7
         * Singleton4（静态内部类式）耗时：40
         * Singleton5（枚举式）耗时：5
         */
    }
}
