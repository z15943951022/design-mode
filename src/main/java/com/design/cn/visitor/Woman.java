package com.design.cn.visitor;

public class Woman extends Preson {
    @Override
    public void accpet(Action action) {
        action.getWomanResult(this);
    }


}
