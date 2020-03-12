package com.design.cn.composite;

public class Department extends Institutional {


    public Department(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("--------"+super.name+"--------");
    }
}
