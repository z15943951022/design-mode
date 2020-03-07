package com.design.cn.adapter.objectAdapter;

/**
 * 手机
 */
public class Phone {

    private Integer electric;

    /**
     * 充电方法 需要传入5V的电压充电器
     * @param voltage5V
     */
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5v()==5){
            System.out.println("可以充电");
        }else {
            System.out.println("无法充电");
        }
    }
}
