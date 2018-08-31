package com.design.responsibilitychain.demo1_1;

/**
 * @Description: 抽象类：管理责任链上的对象处理的抽象类
 * @Auther: lyd
 * @Date: 2018/8/30
 * @Version:v1.0
 */
public abstract class Leader {

    protected String name;
    protected Leader nextLeader;//下一个继承者
    public Leader(String name) {
        super();
        this.name = name;
    }
    //设置责任链上的下一个继承者
    public void setNextLeader(Leader leader){
        this.nextLeader = nextLeader;
    }

    //处理请求的抽象方法
    public abstract void handleRequest(LeaveRequest leader);
}

