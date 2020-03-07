package com.design.cn.factory;

/**
 * 电脑
 */
public class Computer implements Electronic {
    @Override
    public void send() {
        System.out.println("电脑发送消息");
    }
}
