package com.prep.pattern_valut.behavioral.observer;

import java.time.Instant;
import java.util.UUID;

public class UserRegistrationService {

    private final UserEventPublisher publisher;

    public UserRegistrationService(UserEventPublisher publisher) {
        this.publisher = publisher;
    }

    public User register(
            String username,
            String email) {

        UUID userId =  UUID.randomUUID();
        User user = new User(userId.toString(),username,email);

        System.out.println("Validating user completed");
        System.out.println("registering user completed");

        publisher.publish(new UserRegisteredEvent(userId.toString(),user.email(), Instant.now()));
        return user;
    }
}
