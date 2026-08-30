package com.prep.pattern_vault.behavioral.command.basicwithreturntype;

public record SendMailRequest(String senderAddress, String receiverAddress, String message) {
}
