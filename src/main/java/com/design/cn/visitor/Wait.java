package com.design.cn.visitor;

public class Wait extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println("男的评价待定");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("女的评价待定");
    }
}
