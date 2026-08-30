package com.prep.pattern_vault.creational.builder;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final String customerId;
    private final List<OrderItem> items;
    private final Address shippingAddress;
    private final String couponCode;
    private final String customerNote;
    private final boolean expressDelivery;
    private final boolean giftWrap;
    private final String currency;
    private final BigDecimal totalAmount;

    private Order(Builder builder) {
        // can add logic to check if the values that are coming are valid.
        this.customerId = builder.customerId;
        this.items = builder.items;
        this.shippingAddress = builder.shippingAddress;
        this.couponCode = builder.couponCode;
        this.customerNote = builder.customerNote;
        this.expressDelivery = builder.expressDelivery;
        this.giftWrap =builder.giftWrap;
        this.currency = builder.currency;
        this.totalAmount = builder.totalAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public boolean isExpressDelivery() {
        return expressDelivery;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public static final class Builder{
        private final String customerId;
        private final List<OrderItem> items;
        private final Address shippingAddress;
        private String couponCode = "card-001";
        private String customerNote;
        private boolean expressDelivery = false;
        private boolean giftWrap = false;
        private String currency = "USD";
        private final BigDecimal totalAmount;

        public Builder(String customerId, List<OrderItem> items, Address shippingAddress, BigDecimal totalAmount) {
            this.customerId = customerId;
            this.items = items;
            this.shippingAddress = shippingAddress;
            this.totalAmount = totalAmount;
        }

        public Builder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Builder customerNote(String customerNote) {
            this.customerNote = customerNote;
            return this;
        }

        public Builder expressDelivery(boolean expressDelivery) {
            this.expressDelivery = expressDelivery;
            return this;
        }

        public Builder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Order build(){
            // can add a validator method that validates before calling the order constructor.
           return new Order(this);
        }
    }
}
