package com.design.cn.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void print(){
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println("====="+next.getName()+"========");
            DepartmentPlint(next.createIterator());

        }
    }

    public void DepartmentPlint(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
