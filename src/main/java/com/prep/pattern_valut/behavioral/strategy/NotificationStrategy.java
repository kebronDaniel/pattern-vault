package com.prep.pattern_valut.behavioral.strategy;

public interface NotificationStrategy {
    NotificationType getType();
    void send(String recipient, String message);
}
