package com.prep.pattern_vault.structural.adapter;

public interface ShippingGateway {
    ShippingQuote calculateQuote(Shipment shipment);
}
