package com.prep.pattern_vault.behavioral.chainofresponsibility.handlerchain;

public class PaymentPipelineFactory {

    public PaymentSupportHandler constructChain(){
        RequestValidationHandler requestValidationHandler = new RequestValidationHandler();
        requestValidationHandler.setNextHandler(new ActiveAccountHandler())
                .setNextHandler(new PaymentValidationHandler());
        return requestValidationHandler;
    }

}
