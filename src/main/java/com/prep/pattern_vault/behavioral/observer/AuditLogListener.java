package com.prep.pattern_vault.behavioral.observer;

public class AuditLogListener implements UserRegistrationListener {
    @Override
    public void onUserRegistered(UserRegisteredEvent event) {
        System.out.printf("Recording registration of user %s \n", event.userId());
    }
}
