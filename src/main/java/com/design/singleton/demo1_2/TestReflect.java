package com.design.singleton.demo1_2;

import java.lang.reflect.Constructor;

/**
 * @Description:  通过反射破解单例模式
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class TestReflect {

    public static void main(String[] args) throws Exception {
        LazySingleton2 s1 = LazySingleton2.getInstance();
        LazySingleton2 s2 = LazySingleton2.getInstance();
        System.out.println(s1 == s2); //true

        //通过反射破解
        Class<LazySingleton2> clazz = (Class<LazySingleton2>) Class.forName(LazySingleton2.class.getName());
        Constructor<LazySingleton2> c = clazz.getDeclaredConstructor(null);//获得无参构造器
        c.setAccessible(true);//跳过检查：可以访问private构造器
        LazySingleton2 s3 = c.newInstance(); //不加c.setAccessible(true)的话，这里会报错：没有权限访问私有构造器
        LazySingleton2 s4 = c.newInstance();
        System.out.println(s3 == s4); //此时的结果就是false，获得的就是两个对象
    }


    /**
     * 如何防止反射破解单例模式呢？
        在LazySingleton2构造的时候，假如不是第一次就直接抛出异常。不让创建。这样第二次构建的话就直接抛出异常了。
     */
    /*
    private LazySingleton2(){
        if (instance != null) {
            //如果不是第一次构建，则直接抛出异常。不让创建
            throw new RuntimeException();
        }
    }
    */


}

