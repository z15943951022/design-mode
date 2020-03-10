package com.design.cn.interpreter;

import java.util.HashMap;

public class SymbolExpression<T> extends Expression<T> {

    protected Expression<T> left;

    protected Expression<T> right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    T interpreter(HashMap hashMap) {
        return null;
    }
}
