package com.design.cn.factory;

/**
 * 手机
 */
public class Phone implements Electronic {

    @Override
    public void send() {
        System.out.println("发送手机短信");
    }
}
