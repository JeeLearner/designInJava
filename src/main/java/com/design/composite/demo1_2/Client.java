package com.design.composite.demo1_2;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/3
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        MarketBranch rootBranch = new MarketBranch("总店");
        MarketBranch bjBranch = new MarketBranch("北京分店");
        MarketJoin marketJoin = new MarketJoin("北京分店一回龙观加盟店");
        MarketJoin marketJoin2 = new MarketJoin("北京分店二西二旗加盟店");

        bjBranch.add(marketJoin);
        bjBranch.add(marketJoin2);
        rootBranch.add(bjBranch);
        rootBranch.payByCard();
    }


}

