package com.prep.pattern_vault.structural.adapter;

import java.math.BigDecimal;

public record ShippingQuote(
        BigDecimal price,
        String currency,
        int estimatedDays
) {}
