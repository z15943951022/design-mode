package com.design.cn;

import com.design.cn.midiator.Alarm;
import com.design.cn.midiator.CoffeeMacgine;
import com.design.cn.midiator.ConcreteMediator;
import com.design.cn.midiator.Mediator;

public class TestMain {

    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException {

        Mediator mediator = new ConcreteMediator();

        Alarm alarm = new Alarm(mediator, "闹钟");
        CoffeeMacgine coffeeMacgine = new CoffeeMacgine(mediator, "咖啡");
        alarm.sendMessage(0);

    }


}