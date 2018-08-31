package com.design.responsibilitychain.demo1_1;

import com.design.responsibilitychain.demo1_1.c.Director;
import com.design.responsibilitychain.demo1_1.c.GeneralManager;
import com.design.responsibilitychain.demo1_1.c.Manager;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/30
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        //构建各个领导人
        Leader a = new Director("张三");//主任
        Leader b = new Manager("李四");//经理
        Leader c = new GeneralManager("王五");//总经理

        //设置各个责任链上的关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假
        LeaveRequest request = new LeaveRequest("小明", 3, "旅游");
        a.handleRequest(request);//小明提交了请假申请给主任
    }
}

