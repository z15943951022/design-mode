package com.design.cn.prototype;

import java.io.Serializable;

public class DeepProtoTypeTarget implements Serializable,Cloneable {

    private String className;

    private String classPath;

    public DeepProtoTypeTarget(String className, String classPath) {
        this.className = className;
        this.classPath = classPath;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
