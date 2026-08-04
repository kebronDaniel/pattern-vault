package com.prep.pattern_valut.behavioral.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class NotificationServiceRegistry {

    private final HashMap<NotificationType,NotificationStrategy> notificationServices = new HashMap<>();

    public NotificationServiceRegistry(List<NotificationStrategy> strategies) {
        for (NotificationStrategy strategy : strategies) notificationServices.put(strategy.getType(),strategy);
    }

    public NotificationStrategy resolveStrategy(NotificationType type){
        if (! notificationServices.containsKey(type)){
            throw new IllegalArgumentException("Invalid service type");
        }
        return notificationServices.get(type);
    }
}
