package com.prep.pattern_valut.structural.facade.dto;

public record TravelBookingResult(
        String bookingId,
        String flightReservationId,
        String hotelReservationId,
        String paymentId
) {}