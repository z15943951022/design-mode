package com.design.cn.flyweigth;

/**
 * 享元模式工程
 */
public class ConcreteWebSite extends WebSite {

    public ConcreteWebSite(String type) {
        super(type);
    }

    @Override
    public void use(String userName) {
        System.out.println(userName+"在是使用"+super.type+"网站");
    }
}
