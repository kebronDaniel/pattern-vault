package com.prep.pattern_vault.creational.builder;

import java.math.BigDecimal;

public record OrderItem(
        String productId,
        int quantity,
        BigDecimal unitPrice
) {}
