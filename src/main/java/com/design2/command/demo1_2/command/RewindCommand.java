package com.design2.command.demo1_2.command;

import com.design2.command.demo1_2.AudioPlayer;
import com.design2.command.demo1_2.Command;

public class RewindCommand implements Command {

    private AudioPlayer myAudio;
    
    public RewindCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.rewind();
    }

}