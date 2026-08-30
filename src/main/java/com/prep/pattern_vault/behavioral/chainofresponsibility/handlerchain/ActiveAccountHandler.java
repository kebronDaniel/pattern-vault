package com.prep.pattern_vault.behavioral.chainofresponsibility.handlerchain;

public class ActiveAccountHandler extends PaymentSupportHandler {
    @Override
    boolean canHandle(PaymentRequest request) {
        return request.accountActive();
    }

    @Override
    void validateRequest(PaymentRequest request) {
        System.out.println("Checking if the account is active");
        System.out.println("Account is active");
    }
}
