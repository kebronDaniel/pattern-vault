package com.prep.pattern_vault.behavioral.state.order;

public class PaidOrderState extends OrderState {

    @Override
    public void pay(Order order) {
        stateException(this.name(), OrderStage.PAID.name());
    }

    @Override
    public void ship(Order order) {
        order.setCurrentState(new ShippedOrderState());
    }

    @Override
    public void deliver(Order order) {
        stateException(this.name(), OrderStage.DELIVERED.name());
    }

    @Override
    public void cancel(Order order) {
        stateException(this.name(), OrderStage.CANCELED.name());
    }

    @Override
    public void refund(Order order) {
        order.setCurrentState(new CancelledOrderState());
    }

    @Override
    public String name() {
        return OrderStage.PAID.name();
    }
}
