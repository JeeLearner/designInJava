package com.design2.command.demo1_3.command;

import com.design2.command.demo1_3.AudioPlayer;
import com.design2.command.demo1_3.Command;

public class StopCommand implements Command {
    private AudioPlayer myAudio;
    
    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }

}