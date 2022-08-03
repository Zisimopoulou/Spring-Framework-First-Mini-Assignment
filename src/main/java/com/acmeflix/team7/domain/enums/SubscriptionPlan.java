package com.acmeflix.team7.domain.enums;

public enum SubscriptionPlan {
    BASIC("Basic","Monthly Price = 7.99 Euro. Video Quality = Good. Resolution = 480p", 7.99),
    ADVANCED("Advanced","Monthly Price = 10.99 Euro. Video Quality = Better. Resolution = 1080p", 10.99),
    PREMIUM("Premium","Monthly Price = 13.99 Euro. Video Quality = Better. Resolution = 4k + HDR", 13.99);

    private String subsctriptionPlan, discription;
    double price;

    SubscriptionPlan(String subsctriptionPlan, String discription, double price) {
        this.subsctriptionPlan = subsctriptionPlan;
        this.discription = discription;
        this.price = price;
    }

    public String getSubsctriptionPlan() {
        return subsctriptionPlan;
    }

    public String getDiscription() {
        return discription;
    }

    public double getPrice() {
        return price;
    }
}
