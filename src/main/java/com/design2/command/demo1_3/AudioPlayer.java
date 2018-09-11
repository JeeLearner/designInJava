package com.design2.command.demo1_3;

/**
 * @Description: 接收者角色，由录音机类扮演
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class AudioPlayer {

    public void play(){
        System.out.println("播放...");
    }

    public void rewind(){
        System.out.println("倒带...");
    }

    public void stop(){
        System.out.println("停止...");
    }
}

