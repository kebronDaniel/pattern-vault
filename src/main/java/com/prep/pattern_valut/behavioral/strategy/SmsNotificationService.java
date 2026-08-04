package com.prep.pattern_valut.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationStrategy {
    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.printf("Sending sms to : %s with the content : %s", recipient,message);
    }
}
