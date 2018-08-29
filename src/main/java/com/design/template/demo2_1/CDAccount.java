package com.design.template.demo2_1;

/**
 * 定期存款账号
 * @auther: lyd
 * @date: 2018/8/29 15:48
 */
public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }

}