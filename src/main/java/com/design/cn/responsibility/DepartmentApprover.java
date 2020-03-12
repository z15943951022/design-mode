package com.design.cn.responsibility;

public class DepartmentApprover extends Approver {


    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getProce()<=5000){
            System.out.println(super.getName()+"处理成功！单号为"+request.getId());
        }else {
            super.getApprover().processRequest(request);
        }

    }
}
