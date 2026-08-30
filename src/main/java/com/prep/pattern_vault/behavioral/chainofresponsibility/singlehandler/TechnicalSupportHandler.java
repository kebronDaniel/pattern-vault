package com.prep.pattern_vault.behavioral.chainofresponsibility.singlehandler;

public class TechnicalSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportTicket ticket) {
        return ticket.severity().equals(Severity.MEDIUM) ? true : false;
    }

    @Override
    protected SupportResult resolve(SupportTicket ticket) {
        return new SupportResult(ticket.id(),"Technical operations team","Technical error resolution");
    }
}
