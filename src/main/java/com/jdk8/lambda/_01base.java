package com.jdk8.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class _01base {

    public static void main(String[] args) {
        // 1. 不需要参数,返回值为 5
        //() -> 5
        _01base tester = new _01base();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;
        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
        System.out.println("10 + 5 = " + addition.operation(10, 5));

        //不用括号
        GreetingService g1 = message ->
                System.out.println("Hello " + message);
        // 用括号
        GreetingService g2 = (message) ->
                System.out.println("Hello " + message);

        g1.sayMessage("Runoob");
        g1.sayMessage("Google");
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}


interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}

