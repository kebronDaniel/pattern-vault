package com.prep.pattern_valut.structural.facade.Service;

import com.prep.pattern_valut.structural.facade.dto.HotelReservation;

import java.time.LocalDate;
import java.util.UUID;

public class HotelService {

    public HotelReservation reserve(String destination, LocalDate checkIn, LocalDate checkOut) {
        System.out.println("Reserving hotel");
        return new HotelReservation("hotel reservation number - " + UUID.randomUUID());
    }

    public void cancel(String reservationId) {
        System.out.println("Cancelling hotel " + reservationId);
    }
}