package com.prep.pattern_valut.structural.facade.Service;

import com.prep.pattern_valut.structural.facade.dto.PaymentResult;

import java.math.BigDecimal;
import java.util.UUID;

public class PaymentService {

    public PaymentResult charge(String customerId, BigDecimal amount) {
        System.out.println("Processing payment");
        return new PaymentResult("payment-" + UUID.randomUUID(), true);
    }

    public void refund(String paymentId) {
        System.out.println("Refunding payment " + paymentId);
    }
}