package com.design.cn.composite;

public abstract class Institutional {

    protected String name ;

    public Institutional(String name) {
        this.name = name;
    }

    protected void add(Institutional institutional){
        throw new UnsupportedOperationException();
    }

    protected void remove(Institutional institutional){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

}
