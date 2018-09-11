package com.design2.command.demo1_2.command;

import com.design2.command.demo1_2.AudioPlayer;
import com.design2.command.demo1_2.Command;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class PlayCommand implements Command {

    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.play();
    }
}

