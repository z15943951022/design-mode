package com.design.cn.command;

public class TVoffCommand implements Command {

    private TVReceiver tvReceiver;

    public TVoffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    public void execute() {
        tvReceiver.off();
    }

    public void undo() {
        tvReceiver.on();
    }
}
