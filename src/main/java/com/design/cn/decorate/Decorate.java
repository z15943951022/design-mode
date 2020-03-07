package com.design.cn.decorate;

public class Decorate extends Drink {

    public Drink getDrink() {
        return drink;
    }

    private Drink drink;

    public Decorate(Drink drink) {
        super();
        this.drink = drink;
    }

    @Override
    public Float cost() {
        return super.getPric()+drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes()+""+super.getPric()+drink.getDes();
    }
}
