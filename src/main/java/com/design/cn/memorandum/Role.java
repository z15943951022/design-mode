package com.design.cn.memorandum;

import java.io.Serializable;
import java.lang.reflect.Field;

public class Role implements Cloneable, Serializable {

    private int power;

    private int seed;



    public Role createMemento() throws CloneNotSupportedException {
        return (Role) this.clone();
    }

    public void recoverGameRoleFromMemento(Role role) throws IllegalAccessException {
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            declaredField.set(this,declaredField.get(role));
        }
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    @Override
    public String toString() {
        return "Role{" +
                "power=" + power +
                ", seed=" + seed +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
