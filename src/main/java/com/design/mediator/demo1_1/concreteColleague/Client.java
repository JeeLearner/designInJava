package com.design.mediator.demo1_1.concreteColleague;

import com.design.mediator.demo1_1.Mediator;
import com.design.mediator.demo1_1.President;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Mediator m = new President();
        Market market = new Market(m);
        m.register("market", market);
        m.register("finacial", new Finacial(m));
        market.selfAction();
        market.outAction(); //市场部和财务部交互

        /*
            市场部：正在跑市场......
            市场部向总经理说：合同已搞定，需财务部报销.....
            财务部：会计正在核对财务......
         */
    }
}

