package com.prep.pattern_vault.behavioral.state.order;

public class CreatedOrderState extends OrderState {

    @Override
    public void pay(Order order) {
        order.setCurrentState(new PaidOrderState());
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
        order.setCurrentState(new CancelledOrderState());
    }

    @Override
    public void refund(Order order) {
        stateException(this.name(), OrderStage.REFUNDED.name());
    }

    @Override
    public String name() {
        return OrderStage.CREATED.name();
    }

}
