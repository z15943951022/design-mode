package com.design.cn.decorate;

public class LongBackCoffee extends Coffee {

    public LongBackCoffee() {
        super();
        super.setPric(5f);
        super.setDes("美式咖啡");
    }

    @Override
    public Float cost() {
        return super.getPric();
    }

}
