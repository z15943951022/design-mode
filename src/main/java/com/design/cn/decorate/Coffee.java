package com.design.cn.decorate;

public class Coffee extends Drink {

    @Override
    public Float cost() {
        return super.getPric();
    }
}
