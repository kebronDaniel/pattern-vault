package com.prep.pattern_vault.structural.adapter;

public record QuickShipResponse(
        long priceInCents,
        String currencyCode,
        int deliveryDays,
        String status
) {}
