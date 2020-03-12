package com.design.cn.responsibility;

public abstract class Approver {

    private Approver approver;

    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public Approver setApprover(Approver approver1) {
        this.approver = approver1;
        return approver1;
    }

    public Approver getApprover() {
        return this.approver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest request);
}
