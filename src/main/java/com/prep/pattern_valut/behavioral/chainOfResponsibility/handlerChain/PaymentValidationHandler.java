package com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain;

public class PaymentValidationHandler extends PaymentSupportHandler {
    @Override
    boolean canHandle(PaymentRequest request) {
        return request.amount() > 0 && request.accountNumber() != null ? true : false;
    }

    @Override
    void validateRequest(PaymentRequest request) {
        // do validation check
        System.out.println("Validating payment request");
        System.out.println("valid payment request");
    }
}
