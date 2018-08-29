package com.design.template.demo2_1;

/**
 * 货币市场账号
 * @auther: lyd
 * @date: 2018/8/29 15:47
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        
        return 0.045;
    }

}