package com.design.state.demo1_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new FreeState());//空闲状态
        context.request("测试");

        /**

         if ("空闲".equals(home.state)) {
         System.out.println("空闲状态");
         }else if ("已预定".equals(home.state)) {
         System.out.println("已预订");
         }else if ("已入住".equals(home.state)) {
         System.out.println("已入住");
         }

         */
    }
}

