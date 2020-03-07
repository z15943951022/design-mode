package com.design.cn.decorate;

public class Milk extends Decorate {

    public Milk(Drink drink) {
        super(drink);
        super.setPric(2f);
        super.setDes("牛奶");
    }

}
