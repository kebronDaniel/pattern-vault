package com.prep.pattern_valut.structural.facade.Service;

import com.prep.pattern_valut.structural.facade.dto.TravelBookingResult;

public class NotificationService {

    public void sendConfirmation(String email, TravelBookingResult result) {
        System.out.printf("Sending travel confirmation to - %s \n",email);
    }
}