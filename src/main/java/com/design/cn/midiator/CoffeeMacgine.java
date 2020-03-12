package com.design.cn.midiator;

public class CoffeeMacgine extends Colleague {

    public CoffeeMacgine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }


    @Override
    public void sendMessage(int stateChange) {
        super.mediator.getMessage(stateChange,this.name);
    }

    public void startCoffee(){
        System.out.println("咖啡机开机");
    }

    public void stopCoffee(){
        System.out.println("咖啡机关闭");
    }


}
