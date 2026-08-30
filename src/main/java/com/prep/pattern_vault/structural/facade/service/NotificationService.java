package com.prep.pattern_vault.structural.facade.service;

import com.prep.pattern_vault.structural.facade.dto.TravelBookingResult;

public class NotificationService {

    public void sendConfirmation(String email, TravelBookingResult result) {
        System.out.printf("Sending travel confirmation to - %s \n",email);
    }
}