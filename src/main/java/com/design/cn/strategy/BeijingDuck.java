package com.design.cn.strategy;

public class BeijingDuck extends Duck {

    public BeijingDuck(){
        super();
        super.name="北京鸭";
        super.flyBehavior= () -> System.out.println(name+"飞的很差");
    }

    @Override
    public void dispaly() {
        System.out.println(name);
    }


    @Override
    public void fly() {
        System.out.println(name+"不能飞");
    }

}
