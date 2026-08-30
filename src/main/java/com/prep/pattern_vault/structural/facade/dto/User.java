package com.prep.pattern_vault.structural.facade.dto;

import java.util.UUID;

public record User(String username, UUID id, String email) {
}
