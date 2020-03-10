package com.design.cn.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression<Integer> {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    Integer interpreter(HashMap hashMap) {
        return super.left.interpreter(hashMap) + super.right.interpreter(hashMap);
    }
}
