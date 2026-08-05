package com.prep.pattern_valut.structural.facade.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record TravelBookingRequest(
        String customerId,
        String email,
        String origin,
        String destination,
        LocalDate departureDate,
        LocalDate returnDate,
        BigDecimal totalPrice
) {}