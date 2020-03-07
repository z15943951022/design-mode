package com.design.cn.adapter.classAdapter;

/**
 * 适配器
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {


    @Override
    public Integer output5v() {
        Integer integer = super.output220v();
        int detV= integer / 44;
        return detV;
    }
}
