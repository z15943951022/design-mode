package com.design.cn.visitor;

public class Fail extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println("男人评分失败");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("女人评分失败");
    }
}
