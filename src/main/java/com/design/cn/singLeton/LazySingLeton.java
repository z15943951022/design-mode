package com.design.cn.singLeton;

/**
 * 懒汉
 */
public class LazySingLeton {

    private static LazySingLeton lazySingLeton;


    private LazySingLeton() {
    }

    public static synchronized LazySingLeton getInstance() {
        if (null != lazySingLeton){
            lazySingLeton = new LazySingLeton();
        }
        return lazySingLeton;
    }
}
