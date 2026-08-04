package com.prep.pattern_valut.creational.builder;

import java.math.BigDecimal;

public record OrderItem(
        String productId,
        int quantity,
        BigDecimal unitPrice
) {}
