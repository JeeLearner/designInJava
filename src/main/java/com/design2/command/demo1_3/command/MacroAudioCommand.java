package com.design2.command.demo1_3.command;

import com.design2.command.demo1_3.Command;
import com.design2.command.demo1_3.MacroCommand;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {
    
    private List<Command> commandList = new ArrayList<Command>();
    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }
    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        for(Command cmd : commandList){
            cmd.execute();
        }
    }

}