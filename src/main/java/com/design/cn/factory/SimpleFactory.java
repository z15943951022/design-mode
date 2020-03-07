package com.design.cn.factory;

import java.util.Optional;

/**
 * 简单工厂模式:
 *     - 此简单工厂模式利用反射实现有利实现了开闭原则与字符比较有巨大的提升
 * 工厂方法模式:
 *     - 工厂方法不利与类的扩展需要创建许多的方法
 * 抽象工厂模式：
 *     - 此模式不同与上两方案而将工厂视为不确定因素,提高了工厂类的扩展性同时也提高了类的不断增多
 *
 */
public class SimpleFactory extends AbstractFactory{


    /**
     * 简单工厂
     * @param className 全类名
     * @return 抽象接口
     */
    public static Electronic getProduct(String className) {
        try {
            Class<?> aClass = Class.forName(className);
            Object object = aClass.newInstance();
            return Optional.ofNullable(object)
                    .map(o->(Electronic)object)
                    .orElse(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 【工厂方法】 可以看出工厂接口不利于扩展
     * @return 抽象接口
     */
    public static Electronic getComputer(){
        return new Computer();
    }
    public static Electronic getPhone(){
        return new Phone();
    }


    /**
     * 抽象工厂方法
     * @return
     */
    @Override
    public Electronic getInstance() {
        return new Computer();
    }
}
