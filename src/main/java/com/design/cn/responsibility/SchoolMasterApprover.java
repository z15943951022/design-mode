package com.design.cn.responsibility;

public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getProce() > 30000){
            System.out.println(super.getName()+"处理成功！单号为"+request.getId());
        }else {
            super.getApprover().processRequest(request);
        }
    }
}
