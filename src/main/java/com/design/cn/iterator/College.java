package com.design.cn.iterator;

import java.util.Iterator;

public interface College {

    String getName();

    Iterator createIterator();

    void addDepartment(String name ,String desc);



}
