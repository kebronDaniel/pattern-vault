package com.prep.pattern_vault.structural.proxy.dto;

import java.math.BigDecimal;

public record BankAccount(
        String accountId,
        String ownerId,
        BigDecimal balance
) {}