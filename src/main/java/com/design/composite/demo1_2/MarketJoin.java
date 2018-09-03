package com.design.composite.demo1_2;

/**
 * @Description: 加盟店 下面不在有分店和加盟店，最底层
 * @Auther: lyd
 * @Date: 2018/9/3
 * @Version:v1.0
 */
public class MarketJoin extends Market {
    public MarketJoin(String name) {
        super(name);
    }

    @Override
    public void add(Market m) {

    }

    @Override
    public void remove(Market m) {

    }

    @Override
    public void payByCard() {
        System.out.println(name + "消费,积分已累加入该会员卡");
    }
}

