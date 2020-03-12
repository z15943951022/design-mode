package com.design.cn.midiator;

public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        super.mediator.getMessage(stateChange,this.name);
    }

    public void startAlarm(){
        System.out.println("开启闹钟");
    }

    public void sopAlarm(){
        System.out.println("关闭闹钟");
    }
}
