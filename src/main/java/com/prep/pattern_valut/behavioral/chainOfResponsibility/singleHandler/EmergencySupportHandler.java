package com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler;

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
