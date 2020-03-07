package com.design.cn.bulider;

/**
 * 具体建造者
 */
public class BuilderImple extends Builder {

    @Override
    protected void buildBisic() {
        System.out.println("大地之");
        hose.setBaise("地基");
    }

    @Override
    protected void buildWalls() {
        System.out.println("qiang");
        hose.setWall("强");
    }

    @Override
    protected void roofed() {
        System.out.println("该房顶");
        hose.setRoofed("房顶");
    }
}
