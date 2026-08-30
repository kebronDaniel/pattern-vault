package com.prep.pattern_vault.structural.adapter;

import java.math.BigDecimal;

public class QuickShipAdapter implements ShippingGateway {

    private final QuickShipClient quickShipClient;

    public QuickShipAdapter(QuickShipClient quickShipClient) {
        this.quickShipClient = quickShipClient;
    }

    @Override
    public ShippingQuote calculateQuote(Shipment shipment) {

        String route = String.format("From %s to %s", shipment.originCountry(),shipment.destinationCountry());
        int weightInGrams = shipment.weightInKilograms().multiply(BigDecimal.valueOf(1000)).intValue();
        QuickShipResponse response = quickShipClient.requestPrice(route,weightInGrams);

        return new ShippingQuote(BigDecimal.valueOf(response.priceInCents(), 2), response.currencyCode(),response.deliveryDays());
    }
}
