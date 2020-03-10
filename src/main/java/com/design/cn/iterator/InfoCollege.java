package com.design.cn.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    private List<Department> departments;

    public InfoCollege() {
        departments= Arrays.asList(new Department("信息1","信息1"),
                new Department("信息2","信息1"),
                new Department("信息3","信息1"),
                new Department("信息4","信息1"));
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name,desc));
    }
}
