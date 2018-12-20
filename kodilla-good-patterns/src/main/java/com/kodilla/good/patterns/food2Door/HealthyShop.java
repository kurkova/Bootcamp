package com.kodilla.good.patterns.food2Door;

public class HealthyShop extends Shop {
    public String name = "HealthyShop";

    public HealthyShop(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
