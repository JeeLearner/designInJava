package com.jdk8.method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/12
 * @Version:v1.0
 */
public class Test {

    public static void main(String[] args) {
        //testCar();
        test();
    }

    public static void testCar(){
        final Car car = Car.create(Car::new);
        /**
         * 构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
         */
        List<Car> cars = Arrays.asList(car);
        /**
         * 静态方法引用：它的语法是Class::static_method，实例如下
         */
        cars.forEach(Car::collide);
        /**
         * 特定类的任意对象的方法引用：它的语法是Class::method实例如下：
         */
        cars.forEach(Car::repair );
        /**
         * 特定对象的方法引用：它的语法是instance::method实例如下：
         */
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }

    /**
     * 方法引用实例
     * @auther: lyd
     * @date: 2018/9/12 15:20
     */
    public static void test(){
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}

