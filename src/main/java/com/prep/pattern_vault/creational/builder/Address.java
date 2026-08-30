package com.prep.pattern_vault.creational.builder;

public record Address(
        String street,
        String city,
        String postalCode,
        String country
) {}
