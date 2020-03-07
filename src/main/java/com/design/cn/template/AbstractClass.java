package com.design.cn.template;

/**
 * 定义模板骨架
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public final void execute(){
        open();
        put();
        flag();
        close();
    }

    private void open(){
        System.out.println("打开冰箱");
    }

    private void close(){
        System.out.println("关闭冰箱");
    }

    protected abstract void put();

    /**
     * 钩子方法
     */
    protected void  flag(){
    }
}
