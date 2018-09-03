package com.design.facade.demo0;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/3
 * @Version:v1.0
 */
public class Client {
    public static void main(String[] args) {
        //未使用外观模式情况
        SubSystemClass s1 = new SubSystemClass();
        SubSystemClass2 s2 = new SubSystemClass2();
        SubSystemClass3 s3 = new SubSystemClass3();
        s1.methodOne();
        s2.methodTwo();
        s3.methodThree();
    }
}

