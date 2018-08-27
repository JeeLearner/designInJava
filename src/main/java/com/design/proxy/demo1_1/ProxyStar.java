package com.design.proxy.demo1_1;

/**
 * @Description: 代理角色（明星经纪人）：
 *  代理角色中代理了真实角色所需要的操作（唱歌）
 * @Auther: lyd
 * @Date: 2018/8/27
 * @Version:v1.0
 */
public class ProxyStar implements Star{

    //真实对象的引用（明星）
    private Star star;
    //通过构造器给真实角色赋值
    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        //真实对象的操作（明星唱歌）
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }
}

