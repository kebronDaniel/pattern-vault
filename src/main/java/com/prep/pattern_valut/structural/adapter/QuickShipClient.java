package com.prep.pattern_valut.structural.adapter;

public class QuickShipClient {

    public QuickShipResponse requestPrice(String route, int weightInGrams) {
        System.out.println("Calling QuickShip for route " + route);
        return new QuickShipResponse(1_299, "EUR", 3, "SUCCESS");
    }
}