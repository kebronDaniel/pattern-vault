package com.prep.pattern_valut.structural.adapter;

public record QuickShipResponse(
        long priceInCents,
        String currencyCode,
        int deliveryDays,
        String status
) {}
