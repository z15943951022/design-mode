package com.design.cn.midiator;

public abstract class Colleague{

    Mediator mediator;

    String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return mediator;
    }

    public abstract void sendMessage(int stateChange);


}
