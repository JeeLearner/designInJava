package com.design.template.demo2_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}

