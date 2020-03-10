package com.design.cn.visitor;

public class Man extends Preson {

    @Override
    public void accpet(Action action) {
        action.getManResult(this);
    }


}
