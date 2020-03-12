package com.design.cn.state;

public enum StateType implements State {

    /**
     * 订单生成
     */
    PRODUCE(){
        @Override
        public boolean check(Order order) {
            order.setState(CHECKED);
            return true;
        }

        public boolean checkFail(Order order) {
            order.setState(OVER);
            return true;
        }
    },

    /**
     * 已审核
     */
    CHECKED(){
        @Override
        public boolean publish(Order order) {
            order.setState(PUBLISH);
            return true;
        }
    },

    /**
     * 已发布
     */
    PUBLISH(){
        @Override
        public boolean receiving(Order order) {
            order.setState(OBLIGATION);
            return true;
        }

        @Override
        public boolean finish(Order order) {
            order.setState(OVER);
            return true;
        }
    },

    /**
     * 待付款
     */
    OBLIGATION(){
        @Override
        public boolean payment(Order order) {
            order.setState(ACCOUNT_PAIL);
            return true;
        }

        @Override
        public boolean finish(Order order) {
            order.setState(OVER);
            return true;
        }
    },

    /**
     * 已付款
     */
    ACCOUNT_PAIL(){
        @Override
        public boolean feedback(Order order) {
            order.setState(OVER);
            return true;
        }
    },


    /**
     * 结束
     */
    OVER;


    /**
     * 获取对应实例
     * @param state 状态
     * @return
     * @throws ClassNotFoundException
     */
    public static StateType getInstance(String state) throws ClassNotFoundException {
        StateType[] values = values();
        for (StateType value : values) {
            if (value.toString().equalsIgnoreCase(state)){
                return value;
            }
        }
        throw new ClassNotFoundException();
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

