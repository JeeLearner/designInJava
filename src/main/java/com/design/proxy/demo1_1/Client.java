package com.design.proxy.demo1_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/27
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();//真实对象的操作（明星唱歌）
        proxy.collectMoney();
    }
}

