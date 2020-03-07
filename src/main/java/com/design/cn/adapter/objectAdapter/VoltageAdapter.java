package com.design.cn.adapter.objectAdapter;

/**
 * 适配器
 * 对象适配器与类适配器不同减少了继承的耦合性采用聚合的方式及将被适配者的对象注入进来出来
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public Integer output5v() {
        Integer integer = voltage220V.output220v();
        int detV= integer / 44;
        return detV;
    }
}
