package com.design.state.demo1_2;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i=0;i<9;i++) {
            vm.vote("user1", "A项目");
        }
    }
}

