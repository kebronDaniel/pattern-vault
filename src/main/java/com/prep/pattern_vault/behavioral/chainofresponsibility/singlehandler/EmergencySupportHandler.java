package com.prep.pattern_vault.behavioral.chainofresponsibility.singlehandler;

public class EmergencySupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportTicket ticket) {
        return ticket.severity().equals(Severity.CRITICAL) ? true : false;
    }

    @Override
    protected SupportResult resolve(SupportTicket ticket) {
        return new SupportResult(ticket.id(),"Emergency operations team","Emergency error resolution");
    }
}
