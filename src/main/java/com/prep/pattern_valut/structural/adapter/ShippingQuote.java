package com.prep.pattern_valut.structural.adapter;

import java.math.BigDecimal;

public record ShippingQuote(
        BigDecimal price,
        String currency,
        int estimatedDays
) {}
