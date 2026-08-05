package com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain;

public class ActiveAccountHandler extends PaymentSupportHandler {
    @Override
    boolean canHandle(PaymentRequest request) {
        return request.requestId() != null ? true : false;
    }

    @Override
    void validateRequest(PaymentRequest request) {
        System.out.println("Checking if the account is active");
        System.out.println("Account is active");
    }
}
