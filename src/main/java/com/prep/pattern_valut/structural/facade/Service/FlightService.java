package com.prep.pattern_valut.structural.facade.Service;

import com.prep.pattern_valut.structural.facade.dto.FlightReservation;

import java.time.LocalDate;
import java.util.UUID;

public class FlightService {

    public FlightReservation reserve(String origin, String destination, LocalDate departureDate, LocalDate returnDate) {
        System.out.println("Reserving flight");
        return new FlightReservation("flight reservation number-" + UUID.randomUUID());
    }

    public void cancel(String reservationId) {
        System.out.println("Cancelling flight " + reservationId);
    }
}
