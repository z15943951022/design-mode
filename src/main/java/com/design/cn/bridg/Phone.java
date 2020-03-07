package com.design.cn.bridg;

/**
 * 桥接模式
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }

    public void close(){
        brand.close();
    }

    public void call(){
        brand.call();
    }
}
