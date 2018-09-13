package com.design.state.demo1_2.state;

import com.design.state.demo1_2.VoteManager;
import com.design.state.demo1_2.VoteState;

/**
 * @Description: 正常投票
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }
}

