package com.prep.pattern_valut.behavioral.observer;

import java.time.Instant;

public record UserRegisteredEvent(
        String userId,
        String email,
        Instant registeredAt
) {}
