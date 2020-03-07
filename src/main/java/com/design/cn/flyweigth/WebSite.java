package com.design.cn.flyweigth;

/**
 * 抽象网站
 */
public  abstract class WebSite {

    /**
     * 内部状态
     */
    protected String type;

    public WebSite(String type) {
        this.type = type;
    }

    /**
     *
     * @param userName 外部状态
     */
    public abstract void use(String userName);
}

