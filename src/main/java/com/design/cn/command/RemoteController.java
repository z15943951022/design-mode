package com.design.cn.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteController {

    List<Command> onCommands=new ArrayList<>();
    List<Command> offCommands=new ArrayList<>();

    Command onDuCommands;

    public RemoteController() {
        for (int i = 0; i < 5; i++) {
            onCommands.add(i,new NoCommand());
            offCommands.add(i,new NoCommand());
        }
    }

    /**
     * 设置按钮
     * @param index
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int index , Command onCommand,Command offCommand) {
        onCommands.set(index,onCommand);
        offCommands.set(index,offCommand);
    }

    /**
     * 执行打开
     * @param index
     */
    public void offCommand(int index) {
        offCommands.get(index).execute();
        onDuCommands=offCommands.get(index);
    }

    /**
     * 执行关闭
     * @param index
     */
    public void onCommand(int index) {
        onCommands.get(index).undo();
        onDuCommands=onCommands.get(index);
    }


    /**
     * 执行撤销
     * @param index
     */
    public void duCommand(){
        onDuCommands.undo();
    }
}
