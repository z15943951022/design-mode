package com.design.cn.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression<Integer> {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }


    @Override
    Integer interpreter(HashMap hashMap) {
        return (Integer) hashMap.get(key);
    }
}
