package com.design.cn.responsibility;

public class PurchaseRequest {

    private int type;

    private float proce;

    private int id;


    public PurchaseRequest(int type, float proce, int id) {
        this.type = type;
        this.proce = proce;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getProce() {
        return proce;
    }

    public int getId() {
        return id;
    }
}
