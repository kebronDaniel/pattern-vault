package com.prep.pattern_vault.behavioral.chainofresponsibility.handlerchain;

import java.util.UUID;

public record PaymentRequest(UUID requestId, String accountNumber, double amount) {
}
