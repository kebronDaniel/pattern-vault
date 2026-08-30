package com.prep.pattern_vault.behavioral.chainofresponsibility.handlerchain;

public class RequestValidationHandler extends PaymentSupportHandler {

    @Override
    boolean canHandle(PaymentRequest request) {
        return request != null ? true : false;
    }

    @Override
    void validateRequest(PaymentRequest request) {
        System.out.println("Validating the request");
        System.out.println("request validated");
    }
}
