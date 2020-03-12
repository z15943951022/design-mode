package com.design.cn.strategy;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这个鸭子不会飞");
    }
}
