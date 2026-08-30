package com.prep.pattern_vault.structural.proxy.dto;

import com.prep.pattern_vault.structural.proxy.Role;

public record User(
        String id,
        Role role
) {}