package com.design.cn.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Clinet {

    public static void main(String[] args) throws IOException {

        String expstr = new BufferedReader(new InputStreamReader(System.in)).readLine();
        HashMap<String, Integer> value = getValue(expstr);
        Calculator calculator = new Calculator(expstr);
        System.out.println(calculator.run(value));
    }

    public static HashMap<String,Integer> getValue(String expstr){
        HashMap<String, Integer> map = new HashMap<>();

        char[] chars = expstr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('+' != chars[i] && '-' != chars[i]){
                System.out.println("请输入"+chars[i]+"得值");
                Scanner scanner = new Scanner(System.in);
                int i1 = scanner.nextInt();
                map.put(String.valueOf(chars[i]),i1);
            }
        }
        return map;
    }
}
