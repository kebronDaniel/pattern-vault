package com.prep.pattern_vault.structural.facade;

public class BookingFailedException extends RuntimeException {
    public BookingFailedException(String message) {
        super(message);
    }
}
