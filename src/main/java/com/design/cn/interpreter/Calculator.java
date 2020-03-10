package com.design.cn.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    private Expression<Integer> expression;

    public Calculator(String expStr) {

        Stack<Expression<Integer>> stack = new Stack();
        char[] chars = expStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case '+':
                    Expression left = stack.pop();
                    AddExpression addExpression = new AddExpression(left, new VarExpression(String.valueOf(chars[++i])));
                    stack.push(addExpression);
                    break;
                case '-':
                    Expression pop = stack.pop();
                    SubExpression subExpression = new SubExpression(pop, new VarExpression(String.valueOf(chars[++i])));
                    stack.push(subExpression);
                    break;
                default:
                    VarExpression varExpression = new VarExpression(String.valueOf(chars[i]));
                    stack.push(varExpression);
                    break;
            }
        }
        expression=stack.pop();
    }

    public Integer run(HashMap<String,Integer> var){
        return expression.interpreter(var);
    }
}
