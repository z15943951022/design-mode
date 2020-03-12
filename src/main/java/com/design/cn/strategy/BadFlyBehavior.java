package com.design.cn.strategy;

public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("这个鸭子飞翔技术一般");
    }
}
