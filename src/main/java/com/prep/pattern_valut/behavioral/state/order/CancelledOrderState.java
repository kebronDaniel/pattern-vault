package com.prep.pattern_valut.behavioral.state.order;

public class CancelledOrderState extends OrderState {
    @Override
    public void pay(Order order) {
        stateException(this.name(), OrderStage.PAID.name());
    }

    @Override
    public void ship(Order order) {
        stateException(this.name(), OrderStage.SHIPPED.name());
    }

    @Override
    public void deliver(Order order) {
        stateException(this.name(), OrderStage.DELIVERED.name());
    }

    @Override
    public void cancel(Order order) {
        stateException(this.name(), this.name());
    }

    @Override
    public void refund(Order order) {
        order.setCurrentState(new RefundOrderState());
    }

    @Override
    public String name() {
        return OrderStage.CANCELED.name();
    }
}
