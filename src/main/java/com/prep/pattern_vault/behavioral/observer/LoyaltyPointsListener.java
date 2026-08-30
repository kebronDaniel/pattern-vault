package com.prep.pattern_vault.behavioral.observer;

public class LoyaltyPointsListener implements UserRegistrationListener {
    @Override
    public void onUserRegistered(UserRegisteredEvent event) {
        System.out.printf("Awarding loyalty points to %s \n",event.userId());
    }
}
