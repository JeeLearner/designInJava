package com.design.observer.demo1_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        //构建目标对象（主题对象）
        ConcreteSubject subject = new ConcreteSubject();
        //具体的观察者
        ConcreteObserver c1 = new ConcreteObserver();
        ConcreteObserver c2 = new ConcreteObserver();
        ConcreteObserver c3 = new ConcreteObserver();
        c1.setState(10);//设置观察者1的状态为10
        c2.setState(20);//设置观察者2的状态为20
        c3.setState(30);//设置观察者3的状态为30
        //将三个观察者加入到观察者队列中
        subject.registerObserver(c1);
        subject.registerObserver(c2);
        subject.registerObserver(c3);

        //查看未修改时的状态
        System.out.println(c1.getState()); //10
        System.out.println(c2.getState()); //20
        System.out.println(c3.getState()); //30

        System.out.println("-------------修改后的状态-------------");
        //改变目标对象的状态
        subject.setState(1000);
        //查看观察者对象的状态
        System.out.println(c1.getState()); //1000
        System.out.println(c2.getState()); //1000
        System.out.println(c3.getState()); //1000
    }
}

