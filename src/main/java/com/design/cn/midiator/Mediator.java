package com.design.cn.midiator;

public abstract class Mediator {


    abstract void register(String colleagueName,Colleague colleague);


    abstract void getMessage(int stateChange,String colleague);

    abstract void sendMessage();

}
