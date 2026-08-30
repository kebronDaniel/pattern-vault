package com.prep.pattern_vault.structural.adapter;

public class ShippingService {

    private final ShippingGateway shippingGateway;

    public ShippingService(ShippingGateway shippingGateway) {
        this.shippingGateway = shippingGateway;
    }

    public ShippingQuote calculate(Shipment shipment){
        System.out.println("Doing the shipment calculation");
        return shippingGateway.calculateQuote(shipment);
    }
}
