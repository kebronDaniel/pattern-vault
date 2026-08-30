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
        int weightInKg = shipment.weightInKilograms().intValue();
        QuickShipResponse response = quickShipClient.requestPrice(route,weightInKg);

        return new ShippingQuote(BigDecimal.valueOf(response.priceInCents()/100), response.currencyCode(),response.deliveryDays());
    }
}
