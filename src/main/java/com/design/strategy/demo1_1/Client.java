package com.design.strategy.demo1_1;

import com.design.strategy.demo1_1.r.GeneralUser;
import com.design.strategy.demo1_1.r.RegisterUser;
import com.design.strategy.demo1_1.r.RegisterVip;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/30
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        double price = 998; //商品原价

        Strategy generalUser = new GeneralUser();//普通用户
        Strategy registerUser = new RegisterUser();//注册用户
        Strategy registerVip = new RegisterVip();//普通会员


        //根据不同的用户打不同的折扣
        Context c1 = new Context(generalUser);
        c1.printPrice(price);
        Context c2 = new Context(registerUser);
        c2.printPrice(price);
        Context c3 = new Context(registerVip);
        c3.printPrice(price);
    }
}

