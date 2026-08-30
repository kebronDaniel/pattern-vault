package com.prep.pattern_vault.behavioral.chainofresponsibility.singlehandler;

public record SupportResult(
        String ticketId,
        String handledBy,
        String resolution
) {}