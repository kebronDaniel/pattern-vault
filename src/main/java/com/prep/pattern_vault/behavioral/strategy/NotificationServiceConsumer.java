package com.prep.pattern_vault.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class NotificationServiceConsumer {
    private final NotificationServiceRegistry registry;

    public NotificationServiceConsumer(NotificationServiceRegistry registry) {
        this.registry = registry;
    }

    public void doSomething(){
        // do something

        NotificationStrategy strategy = registry.resolveStrategy(NotificationType.EMAIL);
        strategy.send("example@gmail.com","message content");
    }
}
