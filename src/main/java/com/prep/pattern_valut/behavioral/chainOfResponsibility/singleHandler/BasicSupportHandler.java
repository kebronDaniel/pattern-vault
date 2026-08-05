package com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler;

public class BasicSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportTicket ticket) {
        return ticket.severity().equals(Severity.LOW) ? true : false;
    }

    @Override
    protected SupportResult resolve(SupportTicket ticket) {
        return new SupportResult(ticket.id(),"Basic operations team","Basic error resolution");
    }
}
