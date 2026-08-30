package com.prep.pattern_vault.behavioral.chainofresponsibility.singlehandler;

public class SupportEscalationFactory {

    public SupportHandler constructChain(){
        BasicSupportHandler basicSupportHandler = new BasicSupportHandler();
        basicSupportHandler.setNext(new TechnicalSupportHandler())
                .setNext(new SeniorSupportHandler())
                .setNext(new EmergencySupportHandler());
        return basicSupportHandler;
    }
}
