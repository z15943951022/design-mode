package com.design.cn.midiator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {

    public static final String COFFEE="coffeeMacgine";

    Map<String,Colleague> colleagueMap;

    Map<String,String> initKey;

    public ConcreteMediator() {
        colleagueMap = new HashMap();
        initKey = new HashMap();
    }

    @Override
    void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);
        if (colleague instanceof CoffeeMacgine){
            initKey.put(COFFEE,colleagueName);
        }
    }

    @Override
    void getMessage(int stateChange, String colleague) {
        if (colleagueMap.get(colleague) instanceof Alarm){
            if (stateChange == 0){
                ((CoffeeMacgine)colleagueMap.get(initKey.get(COFFEE))).startCoffee();
            }else if (stateChange == 1){
                ((CoffeeMacgine)colleagueMap.get(initKey.get(COFFEE))).stopCoffee();
            }
        }

    }

    @Override
    void sendMessage() {

    }
}
