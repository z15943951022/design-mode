package com.design.cn.command;

public class LigthOffCommand implements Command {


    LightReceiver lightReceiver;

    public LigthOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }


    public void execute() {
        lightReceiver.off();
    }

    public void undo() {
        lightReceiver.on();
    }
}
