package com.prep.pattern_vault.behavioral.observer;

public class WelcomeEmailListener implements UserRegistrationListener {
    @Override
    public void onUserRegistered(UserRegisteredEvent event) {
        System.out.printf("Sending welcome email to %s \n", event.email());
    }
}
