package com.prep.pattern_vault.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class UserEventPublisher {

    private final List<UserRegistrationListener> listeners = new ArrayList<>();

    public void register(UserRegistrationListener listener){
        if (listeners.contains(listener))
            throw new IllegalArgumentException("Listener already exists");
        listeners.add(listener);
    }

    public void deregister(UserRegistrationListener listener){
        if (!listeners.contains(listener))
            throw new IllegalArgumentException("listener not found");
        listeners.remove(listener);
    }

    public void publish(UserRegisteredEvent event){
        for(UserRegistrationListener listener:listeners){
            listener.onUserRegistered(event);
        }
    }
}
