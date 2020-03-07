package com.design.cn.singLeton;

/**
 * 饿汉模式
 */
public class HungrySingLeton {
    public static HungrySingLeton hungrySingLeton=new HungrySingLeton();

    private HungrySingLeton() {
    }

    public static HungrySingLeton getInstance() {
        return hungrySingLeton;
    }
}
