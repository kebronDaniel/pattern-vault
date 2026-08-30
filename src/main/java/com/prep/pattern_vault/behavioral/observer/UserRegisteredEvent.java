package com.prep.pattern_vault.behavioral.observer;

import java.time.Instant;

public record UserRegisteredEvent(
        String userId,
        String email,
        Instant registeredAt
) {}
