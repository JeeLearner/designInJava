package com.design.composite.demo1_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 分店 下面可以有加盟店
 * @Auther: lyd
 * @Date: 2018/9/3
 * @Version:v1.0
 */
public class MarketBranch extends Market {

    public MarketBranch(String name) {
        super(name);
    }

    //加盟店列表
    List<Market> list = new ArrayList<Market>();

    @Override
    public void add(Market m) {
        list.add(m);
    }

    @Override
    public void remove(Market m) {
        list.remove(m);
    }

    @Override
    public void payByCard() {
        System.out.println(name + "消费,积分已累加入该会员卡");
        for (Market m : list) {
            m.payByCard();
        }
    }
}

