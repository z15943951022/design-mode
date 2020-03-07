package com.design.cn.bulider;

/**
 * 建造指挥者 聚合
 */
public class HouseDirector {

    private Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 聚合方法
     */
    public void execute(){
        builder.buildBisic();
        builder.buildWalls();
        builder.roofed();
        Hose result = builder.getResult();
        System.out.println(result);
    }

}
