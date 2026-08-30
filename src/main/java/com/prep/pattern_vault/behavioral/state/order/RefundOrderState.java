package com.prep.pattern_vault.behavioral.state.order;

public class RefundOrderState extends OrderState {
    @Override
    void pay(Order order) {
        stateException(this.name(),OrderStage.PAID.name());
    }

    @Override
    void ship(Order order) {
        stateException(this.name(),OrderStage.SHIPPED.name());
    }

    @Override
    void deliver(Order order) {
        stateException(this.name(),OrderStage.DELIVERED.name());
    }

    @Override
    void cancel(Order order) {
        stateException(this.name(),OrderStage.CANCELED.name());
    }

    @Override
    void refund(Order order) {
        stateException(this.name(),this.name());
    }

    @Override
    String name() {
        return OrderStage.REFUNDED.name();
    }
}
