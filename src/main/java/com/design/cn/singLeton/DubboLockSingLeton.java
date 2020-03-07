package com.design.cn.singLeton;

/**
 * 双重检测锁
 */
public class DubboLockSingLeton {
    private static volatile DubboLockSingLeton dubboLockSingLeton;

    private DubboLockSingLeton(){}

    public static DubboLockSingLeton getInstance() {
        if (null == dubboLockSingLeton){
            synchronized (DubboLockSingLeton.class){
                if (null != dubboLockSingLeton){
                    dubboLockSingLeton=new DubboLockSingLeton();
                }
            }
        }
        return dubboLockSingLeton;
    }
}
