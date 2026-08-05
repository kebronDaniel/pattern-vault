package com.prep.pattern_valut.behavioral.chainOfResponsibility.singleHandler;

public record SupportResult(
        String ticketId,
        String handledBy,
        String resolution
) {}