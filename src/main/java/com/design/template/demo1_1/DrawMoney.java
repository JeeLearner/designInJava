package com.design.template.demo1_1;

/**
 * @Description: 子类实现模板方法：取款
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}

