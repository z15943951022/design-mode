package com.design.cn.strategy;

public class WildDuck extends Duck {

    public WildDuck(){
        super();
        super.name="野鸭子";
        super.flyBehavior=() -> System.out.println(name+"飞的很好");
    }

    @Override
    public void dispaly() {
        System.out.println(name);
    }
}
