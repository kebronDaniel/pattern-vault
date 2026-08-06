package com.prep.pattern_valut.structural.proxy.dto;

import java.math.BigDecimal;

public record BankAccount(
        String accountId,
        String ownerId,
        BigDecimal balance
) {}