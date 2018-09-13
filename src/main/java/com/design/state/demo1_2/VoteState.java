package com.design.state.demo1_2;

/**
 * @Description: 抽象状态类
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public interface VoteState {

    /**
     * 处理状态对应的行为
     * @param user    投票人
     * @param voteItem    投票项
     * @param voteManager    投票上下文，用来在实现状态对应的功能处理的时候，
     *                         可以回调上下文的数据
     */
    public void vote(String user, String voteItem, VoteManager voteManager);
}

