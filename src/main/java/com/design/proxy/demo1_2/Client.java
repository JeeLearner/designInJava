package com.design.proxy.demo1_2;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/27
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
       testStarHandler();
       testStarHandlerJdk();
       testStarHandlerCglib();
    }

    private static void testStarHandler(){
        //真实角色
        Star realStar = new RealStar();
        //处理器
        StarHandler handler = new StarHandler(realStar);
        //代理类
        Star star = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        star.sing();//调用代理类的唱歌方法：其实调用的是真实角色的唱歌方法
    }

    private static void testStarHandlerJdk(){
        StarHandlerJdk proxy = new StarHandlerJdk();
        Star star = (Star)proxy.bind(new RealStar());
        star.sing();
    }

    private static void testStarHandlerCglib(){
        StarHandlerCglib proxy = new StarHandlerCglib();
        RealStarCglib star = (RealStarCglib)proxy.getInstance(new RealStarCglib());
        star.sing();
    }
}

