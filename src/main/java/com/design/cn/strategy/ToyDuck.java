package com.design.cn.strategy;

public class ToyDuck extends Duck {

    public ToyDuck(FlyBehavior flyBehavior) {
        super();
        super.name="玩具鸭";
        super.flyBehavior=() -> System.out.println(name+"不会飞");
    }

    @Override
    public void dispaly() {
        System.out.println(name);
    }

}
