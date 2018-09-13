package com.jdk8.lambda;

/**
 * 变量作用域
 * @auther: lyd
 * @date: 2018/9/12 9:48
 */
public class _02base {
 
   final static String salutation = "Hello! ";
   
   public static void main(String args[]){
      GreetingService greetService1 = message -> 
      System.out.println(salutation + message);
      greetService1.sayMessage("Runoob"); //Hello! Runoob
   }
    
   interface GreetingService {
      void sayMessage(String message);
   }
}
