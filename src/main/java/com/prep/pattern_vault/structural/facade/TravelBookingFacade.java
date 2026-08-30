package com.prep.pattern_vault.structural.facade;

import com.prep.pattern_vault.structural.facade.service.FlightService;
import com.prep.pattern_vault.structural.facade.service.HotelService;
import com.prep.pattern_vault.structural.facade.service.NotificationService;
import com.prep.pattern_vault.structural.facade.service.PaymentService;
import com.prep.pattern_vault.structural.facade.dto.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class TravelBookingFacade {

    private final FlightService flightService;
    private final HotelService hotelService;
    private final NotificationService notificationService;
    private final PaymentService paymentService;
    private final User user;


    public TravelBookingFacade(User user) {
        this.flightService = new FlightService();
        this.hotelService = new HotelService();
        this.notificationService = new NotificationService();
        this.paymentService = new PaymentService();
        this.user = user;
    }

    public TravelBookingResult bookTrip(){

        FlightReservation flightReservation = flightService.reserve("US", "UK", LocalDate.now(), LocalDate.now().plusDays(5));
        HotelReservation hotelReservation = hotelService.reserve("UK", LocalDate.now().plusDays(1)
                ,LocalDate.now().plusDays(5));
        PaymentResult paymentResult = paymentService.charge(user.id().toString(), BigDecimal.valueOf(3000));
        UUID bookingId = UUID.randomUUID();
        TravelBookingResult result = new TravelBookingResult(bookingId.toString(),flightReservation.id()
                ,hotelReservation.id(),paymentResult.id());
        notificationService.sendConfirmation(user.email(),result);
        return result;
    }
}
