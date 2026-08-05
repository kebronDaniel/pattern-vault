package com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler;

public record SupportTicket(
        String id,
        String customerId,
        Severity severity,
        String description
) {}