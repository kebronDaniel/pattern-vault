package com.prep.pattern_vault.behavioral.chainofresponsibility.singlehandler;

public class SeniorSupportHandler extends SupportHandler
{
    @Override
    protected boolean canHandle(SupportTicket ticket) {
        return ticket.severity().equals(Severity.HIGH) ? true : false;
    }

    @Override
    protected SupportResult resolve(SupportTicket ticket) {
        return new SupportResult(ticket.id(),"Senior operations team","Senior error resolution");
    }
}
