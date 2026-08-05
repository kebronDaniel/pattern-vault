package com.prep.pattern_valut.structural.adapter;

public interface ShippingGateway {
    ShippingQuote calculateQuote(Shipment shipment);
}
