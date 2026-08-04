package com.prep.pattern_valut.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationStrategy {
    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.printf("Sending email to :%s with content : %s", recipient, message);
    }
}
