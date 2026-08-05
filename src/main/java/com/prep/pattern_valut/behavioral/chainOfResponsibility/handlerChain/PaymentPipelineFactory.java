package com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain;

public class PaymentPipelineFactory {

    public PaymentSupportHandler constructChain(){
        RequestValidationHandler requestValidationHandler = new RequestValidationHandler();
        requestValidationHandler.setNextHandler(new ActiveAccountHandler())
                .setNextHandler(new PaymentValidationHandler());
        return requestValidationHandler;
    }

}
