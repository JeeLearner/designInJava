package com.design.template.demo1_1;

/**
 * @Description: //模板抽象方法
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public abstract class BankTemplateMethod {

    //模板方法中其他业务逻辑
    //1.取号排队
    private void takeNumber(){
        System.out.println("取号排队");
    }
    //2.办理具体的业务：这里留给子类来实现！！！
    protected abstract void transact();

    //3.给客服评分
    private void evaluate(){
        System.out.println("反馈评分");
    }
    //模板方法
    public final void process(){
        this.takeNumber();
        this.transact();//这里则是具体的模板方法函数
        this.evaluate();
    }

}

