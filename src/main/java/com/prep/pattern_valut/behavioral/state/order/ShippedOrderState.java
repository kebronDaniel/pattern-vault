package com.prep.pattern_valut.behavioral.state.order;

public class ShippedOrderState extends OrderState {
    @Override
    void pay(Order order) {
        stateException(this.name(), OrderStage.PAID.name());
    }

    @Override
    void ship(Order order) {
        stateException(this.name(), this.name());
    }

    @Override
    void deliver(Order order) {
        order.setCurrentState(new DeliveredOrderState());
    }

    @Override
    void cancel(Order order) {
        stateException(this.name(), OrderStage.CANCELED.name());
    }

    @Override
    void refund(Order order) {
        stateException(this.name(), OrderStage.REFUNDED.name());
    }

    @Override
    String name() {
        return OrderStage.SHIPPED.name();
    }
}
