package com.design.cn.responsibility;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getProce() <= 10000){
            System.out.println(super.getName()+"处理成功！单号为"+request.getId());
        }else {
            super.getApprover().processRequest(request);
        }
    }
}
