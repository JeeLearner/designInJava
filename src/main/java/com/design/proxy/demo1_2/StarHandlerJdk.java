package com.design.proxy.demo1_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: JDK动态代理代理类
 * @Auther: lyd
 * @Date: 2018/8/27
 * @Version:v1.0
 */
public class StarHandlerJdk implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("事物开始");
        //执行方法
        result=method.invoke(target, args);
        System.out.println("事物结束");
        return result;
    }

    public Object bind(Object target) {
        this.target = target;
        //取得代理对象 [//要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)  ]
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}

