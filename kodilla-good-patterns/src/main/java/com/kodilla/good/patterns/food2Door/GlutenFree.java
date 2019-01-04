package com.kodilla.good.patterns.food2Door;

public class GlutenFree extends Shop {
    public String name = "GlutenFree";

    public GlutenFree(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}

