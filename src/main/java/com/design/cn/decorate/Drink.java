package com.design.cn.decorate;

public abstract class Drink {

    private String des;

    private Float pric =0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    public Float getPric() {
        return pric;
    }

    public void setPric(Float pric) {
        this.pric = pric;
    }


    public abstract Float cost();
}
