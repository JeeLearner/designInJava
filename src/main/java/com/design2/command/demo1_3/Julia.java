package com.design2.command.demo1_3;

import com.design2.command.demo1_3.command.MacroAudioCommand;
import com.design2.command.demo1_3.command.PlayCommand;
import com.design2.command.demo1_3.command.RewindCommand;
import com.design2.command.demo1_3.command.StopCommand;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class Julia {

    public static void main(String[] args) {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroCommand marco = new MacroAudioCommand();
        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.execute();
    }
}

