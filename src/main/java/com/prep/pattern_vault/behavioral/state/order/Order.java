package com.prep.pattern_vault.behavioral.state.order;

public class Order {

    private OrderState currentState;

    public Order() {
        this.currentState = new CreatedOrderState();
    }

    protected void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }

    public void pay(){
        currentState.pay(this);
    }

    public void ship(){
        currentState.ship(this);
    }

    public void deliver(){
        currentState.deliver(this);
    }

    public void cancel(){
        currentState.cancel(this);
    }

    public void refund(){
        currentState.refund(this);
    }

    public String getCurrentState() {
        return currentState.name();
    }
}
