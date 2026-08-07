package com.prep.pattern_valut.behavioral.command.basicWithReturnType;

public record SendMailRequest(String senderAddress, String receiverAddress, String message) {
}
