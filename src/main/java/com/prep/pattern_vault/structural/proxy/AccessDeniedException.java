package com.prep.pattern_vault.structural.proxy;

public class AccessDeniedException extends RuntimeException{
    public AccessDeniedException(String message) {
        super(String.format("Access denied for user with id - %s, the user does not have the correct privilege",
                message));
    }
}
