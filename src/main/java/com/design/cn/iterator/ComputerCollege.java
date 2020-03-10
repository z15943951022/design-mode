package com.design.cn.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department [] departments;

    /**
     * 保存当前下标
     */
    int numberOfDepartment = 0;

    public ComputerCollege() {
        departments=new Department[4];
        departments[0] = new Department("java","java专业");
        departments[1] = new Department("dba","大数据专业");
        departments[2] = new Department("web","前端专业");
        departments[3] = new Department("算法","算法专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department();
        department.setName(name);
        department.setDesc(desc);
        departments[numberOfDepartment++] = department;
    }
}
