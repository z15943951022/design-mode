package com.design.cn.command;

/**
 * 没有任何命令，即空执行，用于初始化每个按钮
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
