package com.design.cn.strategy;

public abstract class Duck {

    protected String name;

    protected FlyBehavior flyBehavior;


    public abstract void dispaly();

    public void quack(){
        System.out.println(name+"叫");
    }

    public void fly(){
        if (null != flyBehavior)
            flyBehavior.fly();
    }

    public void swim(){
        System.out.println(name+"在游泳");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
