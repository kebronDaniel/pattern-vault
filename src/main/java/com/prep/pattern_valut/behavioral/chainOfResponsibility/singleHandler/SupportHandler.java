package com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler;

public abstract class SupportHandler {

    private SupportHandler next;

    public SupportHandler setNext(SupportHandler next) {
        this.next = next;
        return next;
    }
    public SupportResult handle(SupportTicket ticket){
        if (canHandle(ticket)) return resolve(ticket);
        if (next != null) {
            return next.handle(ticket);
        } else {
          throw new IllegalArgumentException("No handler found for " + ticket.severity());
        }
    }

    protected abstract boolean canHandle(SupportTicket ticket);
    protected abstract SupportResult resolve(SupportTicket ticket);
}
