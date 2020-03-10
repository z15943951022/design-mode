package com.design.cn.interpreter;

import java.util.HashMap;

public class NoExpression extends Expression {


    @Override
    Object interpreter(HashMap hashMap) {
        return null;
    }
}
