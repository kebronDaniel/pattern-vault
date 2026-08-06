package com.prep.pattern_valut.structural.proxy.dto;

import com.prep.pattern_valut.structural.proxy.Role;

public record User(
        String id,
        Role role
) {}