package com.design.cn.singLeton;

public class InteriorSingLenton {

    private static class SingLetonHolder{
        private static final InteriorSingLenton SINGLENTON= new InteriorSingLenton();
    }

    private InteriorSingLenton(){}

    public static InteriorSingLenton getInstance() {
        return SingLetonHolder.SINGLENTON;
    }
}
