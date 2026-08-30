package com.prep.pattern_vault.behavioral.strategy;

public interface NotificationStrategy {
    NotificationType getType();
    void send(String recipient, String message);
}
