package com.design.cn.visitor;

public class Success extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println("男人评分通过");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("女人评分通过");

    }
}
