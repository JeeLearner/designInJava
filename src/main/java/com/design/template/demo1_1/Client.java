package com.design.template.demo1_1;

import java.awt.image.BandCombineOp;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        BankTemplateMethod template = new DrawMoney();
        template.process();

        //当然，也可以通过匿名内部类的方式进行访问
        BankTemplateMethod templateMethod = new BankTemplateMethod() {
            //这里使用匿名内部类实现:只需实现具体业务部分，其他部分则使用模板方法定义好的骨架
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };
        templateMethod.process();

    }
}

