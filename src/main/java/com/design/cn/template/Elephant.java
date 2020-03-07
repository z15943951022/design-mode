package com.design.cn.template;

public class Elephant extends AbstractClass{


    @Override
    protected void put() {
        System.out.println("大象装入冰箱");
    }

    @Override
    protected void flag() {
        System.out.println("大象跑出了冰箱");
    }
}
