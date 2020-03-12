package com.design.cn.state;

public interface State {

    RuntimeException ex = new RuntimeException("该状态不支持此操作");

    /**
     * 审核
     *
     * @return
     */
    default boolean check(Order order) {
        throw ex;
    }

    /**
     * 审核失败
     *
     * @return
     */
    default boolean checkFail(Order order) {
        throw ex;
    }

    /**
     * 发布
     *
     * @return
     */
    default boolean publish(Order order) {
        throw ex;
    }

    /**
     * 接单
     * @param
     * @return
     */
    default boolean receiving(Order order) {
        throw ex;
    }

    /**
     * 付款
     *
     * @return
     */
    default boolean payment(Order order) {
        throw ex;
    }

    /**
     * 反馈(下款或取消)
     *
     * @return
     */
    default boolean feedback(Order order) {
        throw ex;
    }

    /**
     * 结束订单
     *
     * @return
     */
    default boolean finish(Order order) {
        throw ex;
    }

}
