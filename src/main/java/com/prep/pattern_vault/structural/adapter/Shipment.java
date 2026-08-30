package com.prep.pattern_vault.structural.adapter;

import java.math.BigDecimal;

public record Shipment(
        String originCountry,
        String destinationCountry,
        BigDecimal weightInKilograms
) {}
