package com.design.cn.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    Department [] departments;
    int postition = -1;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return postition >= departments.length-1 || departments[postition+1] == null ? false : true;
    }

    @Override
    public Object next() {
        return departments[++postition];
    }

    @Override
    public void remove() {
        for (int i = postition; i < departments.length-1; i++) {
            Department temp = departments[postition];
            departments[postition] = departments[postition+1];
            departments[postition+1] = temp;
        }
        departments [departments.length-1]=null;
    }
}
