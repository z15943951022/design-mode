package com.design.cn.interpreter;

import java.util.HashMap;

public abstract class Expression<T> {

    abstract T interpreter(HashMap hashMap);
}
