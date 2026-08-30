package com.prep.pattern_vault.structural.facade;

import com.prep.pattern_vault.structural.facade.service.FlightService;
import com.prep.pattern_vault.structural.facade.service.HotelService;
import com.prep.pattern_vault.structural.facade.service.NotificationService;
import com.prep.pattern_vault.structural.facade.service.PaymentService;
import com.prep.pattern_vault.structural.facade.dto.*;

import java.util.UUID;

public class TravelBookingFacade {

    private final FlightService flightService;
    private final HotelService hotelService;
    private final NotificationService notificationService;
    private final PaymentService paymentService;

    public TravelBookingFacade() {
        this.flightService = new FlightService();
        this.hotelService = new HotelService();
        this.notificationService = new NotificationService();
        this.paymentService = new PaymentService();
    }

    public TravelBookingResult bookTrip(TravelBookingRequest request){

        FlightReservation flightReservation = flightService.reserve(request.origin(), request.destination()
                ,request.departureDate(), request.returnDate());
        HotelReservation hotelReservation = hotelService.reserve(request.destination(), request.departureDate()
                ,request.returnDate());
        PaymentResult paymentResult = paymentService.charge(request.customerId(), request.totalPrice());

        if (!paymentResult.result()) {
            flightService.cancel(flightReservation.id());
            hotelService.cancel(hotelReservation.id());
            throw new BookingFailedException("Payment failed for customer " + request.customerId());
        }

        UUID bookingId = UUID.randomUUID();
        TravelBookingResult result = new TravelBookingResult(bookingId.toString(),flightReservation.id()
                ,hotelReservation.id(),paymentResult.id());
        notificationService.sendConfirmation(request.email(),result);
        return result;
    }
}
