package com.design.cn.bridg;

public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠手机开机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠手机关机");

    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠手机带打电话");

    }
}
