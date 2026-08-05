package com.prep.pattern_valut.behavioral.chainOfResponsibility.handlerChain;

import java.util.UUID;

public record PaymentRequest(UUID requestId, String accountNumber, double amount) {
}
