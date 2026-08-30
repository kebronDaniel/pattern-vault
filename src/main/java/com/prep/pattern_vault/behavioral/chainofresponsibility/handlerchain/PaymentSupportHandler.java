package com.prep.pattern_vault.behavioral.chainofresponsibility.handlerchain;

public abstract class PaymentSupportHandler {

    private PaymentSupportHandler nextHandler;

    public PaymentSupportHandler setNextHandler(PaymentSupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handle(PaymentRequest request){
        if (canHandle(request)) {
            validateRequest(request);
        } else {
            throw new IllegalArgumentException("Invalid request");
        }
        if (nextHandler != null) nextHandler.handle(request);
    }

    abstract boolean canHandle(PaymentRequest request);
    abstract void validateRequest(PaymentRequest request);

}
