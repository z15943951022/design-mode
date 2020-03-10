package com.design.cn.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression<Integer> {


    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    Integer interpreter(HashMap hashMap) {
        return super.left.interpreter(hashMap) - super.right.interpreter(hashMap);
    }
}
