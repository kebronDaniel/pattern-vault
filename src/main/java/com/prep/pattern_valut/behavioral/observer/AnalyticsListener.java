package com.prep.pattern_valut.behavioral.observer;

public class AnalyticsListener implements UserRegistrationListener {
    @Override
    public void onUserRegistered(UserRegisteredEvent event) {
        System.out.printf("Recording user registration in analytics \n");
    }
}
