package com.design.cn.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    private List<Preson> presons=new LinkedList();

    public void attach(Preson preson){
        presons.add(preson);
    }

    public void detach(Preson preson){
        presons.remove(preson);
    }

    public void display(Action action){
        for (Preson preson : presons) {
            preson.accpet(action);
        }
    }

}
