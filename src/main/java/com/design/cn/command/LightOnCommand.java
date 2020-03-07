package com.design.cn.command;

public class LightOnCommand implements Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }


    public void execute() {
        lightReceiver.on();
    }

    public void undo() {
        lightReceiver.off();
    }
}
