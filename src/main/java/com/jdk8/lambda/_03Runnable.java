package com.jdk8.lambda;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/12
 * @Version:v1.0
 */
public class _03Runnable {

    public static void main(String[] args) {
        // 1.1使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类");
            }
        }).start();
        // 1.2使用 lambda expression
        new Thread(() -> System.out.println("使用lambda")).start();

        // 2.1使用匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类");
            }
        };

        // 2.2使用 lambda expression
        Runnable runnable1 = () -> System.out.println("使用lambda");

        // 直接调用 run 方法(没开新线程哦!)
        runnable.run();
        runnable1.run();
    }
}

