package com.design.cn.composite;

import java.util.ArrayList;
import java.util.List;

public class School extends Institutional {

    List<Institutional> list=new ArrayList<>();

    public School(String name) {
        super(name);
    }


    @Override
    public void add(Institutional college) {
        list.add(college);
    }

    @Override
    public void remove(Institutional college) {
        list.remove(college);
    }

    @Override
    public void print() {
        System.out.println("--------"+super.name+"--------");
        list.forEach(Institutional::print);
    }
}
