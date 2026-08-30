package com.prep.pattern_vault.behavioral.chainofresponsibility.singlehandler;

public record SupportTicket(
        String id,
        String customerId,
        Severity severity,
        String description
) {}