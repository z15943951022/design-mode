package com.design.cn.bulider;

/**
 * 【抽象层建造者】 目的与产品解耦 遵循迪米特法则
 */
public abstract class Builder extends Hose {

    protected Hose hose=new Hose();

    protected abstract void buildBisic();

    protected abstract void buildWalls();

    protected abstract void roofed();

    protected Hose getResult(){
        return hose;
    }
}
