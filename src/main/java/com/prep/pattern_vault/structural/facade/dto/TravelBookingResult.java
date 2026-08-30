package com.prep.pattern_vault.structural.facade.dto;

public record TravelBookingResult(
        String bookingId,
        String flightReservationId,
        String hotelReservationId,
        String paymentId
) {}