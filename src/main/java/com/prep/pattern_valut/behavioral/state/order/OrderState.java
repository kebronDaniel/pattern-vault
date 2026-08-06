package com.prep.pattern_valut.behavioral.state.order;

public abstract class OrderState {

    abstract void pay(Order order);

    abstract void ship(Order order);

    abstract void deliver(Order order);

    abstract void cancel(Order order);

    abstract void refund(Order order);

    abstract String name();

    protected void stateException(String currentStage, String targetStage){
        throw new IllegalStateException(String.format
                ("Can not transition from %s stage to %s",currentStage,targetStage));
    }
}