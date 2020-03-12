package com.design.cn.strategy;

public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("这个鸭子会飞翔");
    }
}
